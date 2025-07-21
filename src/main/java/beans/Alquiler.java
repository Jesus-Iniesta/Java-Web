package beans;

import java.util.Date;

public class Alquiler {
    private int id;
    private String userName;
    private Date fechaAlquiler;
    private boolean novedad;
    private String genero;

    public Alquiler(int id, String userName, Date fechaAlquiler, boolean novedad, String genero) {
        this.id = id;
        this.userName = userName;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.genero = genero;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaAlquiler=" + fechaAlquiler +
                ", id=" + id +
                ", userName='" + userName + '\'' +
                ", novedad=" + novedad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
