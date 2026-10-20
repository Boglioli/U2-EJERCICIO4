public class Bibloteca {
    public ComprobantePrestamo prestarLibro(Libro libro, Socio socio) {
        if (libro.estaDisponible()) {
            libro.prestar();
            System.out.println("solicitud aceptada");
            return new ComprobantePrestamo(libro, socio);
        } else {
            System.out.println("solicitud rechazada. El libro no está disponible.");
            return null;
        }
    }
}
