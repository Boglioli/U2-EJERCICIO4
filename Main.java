public class Main {
    public static void main(String[] args) {
        Bibloteca bibloteca = new Bibloteca();
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Socio socio = new Socio("Juan Pérez", 123);
        System.out.println("PRESTAMO EXITOSO");
        ComprobantePrestamo comprobante = bibloteca.prestarLibro(libro1, socio);
        if (comprobante != null) {
            comprobante.mostrar();
        }
        System.out.println("PRESTAMO FALLIDO");
        ComprobantePrestamo comprobante2 = bibloteca.prestarLibro(libro1, socio);
        if (comprobante2 == null) {
            System.out.println("No se pudo realizar el préstamo.");
        } else {
            comprobante2.mostrar();
        }
    }
}
