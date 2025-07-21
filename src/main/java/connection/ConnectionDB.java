package connection;


import org.mariadb.jdbc.Connection;

public class ConnectionDB  {

    static String name = "libreria";
    static String port = "3307";
    static String user = "root";
    static String password = "1234";
    static String url = "jdbc:mysql://localhost:" + port + "/" + name;

    Connection con = null;
    /**
     * Constructor for establishing a connection to the database.
     */
    public ConnectionDB() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = (Connection) java.sql.DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
