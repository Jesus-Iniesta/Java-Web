package test;

import beans.Libro;
import connection.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OperacionesDB {
    public static void main(String[] args) {
        //actualizarLibro(1, "Aventura");
        listarLibros();
    }

    public static void actualizarLibro(int id, String genero){
        String sql = "UPDATE libros SET genero = ? WHERE id = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            // Obtener la conexión a la base de datos
            con = ConnectionDB.getConnection();
            // Preparar la sentencia SQL
            ps = con.prepareStatement(sql);
            // Establecer los parámetros de la sentencia
            ps.setString(1, genero);
            ps.setInt(2, id);
            // Ejecutar la actualización
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Libro actualizado correctamente.");
            } else {
                System.out.println("No se encontró el libro con ID: " + id);
            }

        }catch (Exception e){
            System.out.println("Error al actualizar el libro: " + e.getMessage());
        } finally {

        }
    }

    public static void listarLibros() {
        String sql = "SELECT * FROM libros";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            // Obtener la conexión a la base de datos
            con = ConnectionDB.getConnection();
            // Preparar la sentencia SQL
            ps = con.prepareStatement(sql);
            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();
            // Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String genero = rs.getString("genero");
                String autor = rs.getString("autor");
                int copias = rs.getInt("copias");
                boolean novedad = rs.getBoolean("novedad");
                Libro libro = new Libro(id, titulo,novedad,copias,autor,genero);
                System.out.println(libro.toString());
            }
        } catch (Exception e) {
            System.out.println("Error al listar los libros: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(con);
        }
    }
}
