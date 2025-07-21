package beans;

public class Libro {
    private int id;
    private String titulo;
    private String genero;
    private String autor;
    private int copias;
    private boolean novedad;

    public Libro(int id, String titulo, boolean novedad, int copias, String autor, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.novedad = novedad;
        this.copias = copias;
        this.autor = autor;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                ", id=" + id +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", copias=" + copias +
                ", novedad=" + novedad +
                '}';
    }
}
