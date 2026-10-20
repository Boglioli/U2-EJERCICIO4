public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public void prestar() {
        disponible = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
}
