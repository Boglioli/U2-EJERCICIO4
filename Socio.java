public class Socio {
    public String nombre;
    private int numeroSocio;
    public Socio(String nombre, int numeroSocio) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroSocio() {
        return numeroSocio;
    }
}
