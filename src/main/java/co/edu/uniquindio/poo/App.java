package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca("Uniquindio",0.0);
        // se crean los bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecario("Carlos","102345678","carlos@gmail.com",31,1.500, LocalDate.now());
        Bibliotecario bibliotecario2 = new Bibliotecario("Alejo","10245671","alejo@gmail.com",32,1.500,LocalDate.now());
        Bibliotecario bibliotecario3 = new Bibliotecario("Juan","101010111","juan@gmail.com",33,1.500,LocalDate.now());
        // se agregan los bibliotecarios a la biblioteca
        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarBibliotecario(bibliotecario2);
        biblioteca.agregarBibliotecario(bibliotecario3);


        //se crean los estudiantes
        Estudiante estudiante1 = new Estudiante("raul","1112233","raulito@gmail.com",34,true);
        Estudiante estudiante2 = new Estudiante("felipe","1239473","felipe77@gmail.com",35,true);
        Estudiante estudiante3 = new Estudiante("mario","10183927","mario64@gmail.com",36,true);
        //se agregan los estudiantes a la biblioteca
        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);

        
        // se crean los libros
        Libro libro1 = new Libro("10247", "1112233", "Rafael", "Escobar", "07 xxww", 5, LocalDate.of(2000, 8, 2), true, 3000);
        Libro libro2 = new Libro("20247", "111223344", "Rafael", "Jose Escobar", "09 xxww", 2, LocalDate.of(1950, 1, 20), true, 3000);
        Libro libro3 = new Libro("30247", "111223355", "Rafael", "Sebas Escobar", "200 xxww", 0, LocalDate.of(2010, 11, 4), true, 3000);
        //se agregan los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);


        //se crea el prestamo
        Prestamo prestamo1 = new Prestamo("123",LocalDate.now() , LocalDate.of(2024, 10, 2), bibliotecario1, estudiante1);
        Prestamo prestamo2 = new Prestamo("1234", LocalDate.now() , LocalDate.of(2024, 11, 1), bibliotecario2, estudiante2);
        Prestamo prestamo3 = new Prestamo("12345", LocalDate.now() , LocalDate.of(2024, 10, 20), bibliotecario2, estudiante3);
        Prestamo prestamo4 = new Prestamo("123456", LocalDate.now() , LocalDate.of(2024, 9, 29), bibliotecario3, estudiante3);
        //se agregan los prestamos a el bibliotecario
        biblioteca.crearPrestamo(prestamo1);
        biblioteca.crearPrestamo(prestamo2);
        biblioteca.crearPrestamo(prestamo3);
        biblioteca.crearPrestamo(prestamo4);
        // biblioteca.crearPrestamo(prestamo1, 3, libro1);


        //se crea el prestamo
        DetallePrestamo detallePrestamo1 = new DetallePrestamo(3, prestamo1, libro1);
        DetallePrestamo detallePrestamo2 = new DetallePrestamo(1, prestamo2, libro2);
        DetallePrestamo detallePrestamo3 = new DetallePrestamo(1, prestamo3, libro3);
        DetallePrestamo detallePrestamo4 = new DetallePrestamo(1, prestamo4, libro2);
        //se agregan los detalles de los prestamos a los prestamos
        prestamo1.agregarDetallePrestamos(detallePrestamo1);
        prestamo1.agregarDetallePrestamos(detallePrestamo2);
        prestamo1.agregarDetallePrestamos(detallePrestamo3);
        prestamo1.agregarDetallePrestamos(detallePrestamo4);

        //Probar los metodos creados
        bibliotecario1.consultarprestamo("123456");
        bibliotecario3.consultarprestamo("123");
        bibliotecario2.adicionarPrestamo(prestamo4, libro1, 1);
        biblioteca.buscarLibro("10247");
        biblioteca.mostrarCantidadPrestamosEstudiante("1112233");
        biblioteca.mostrarCantidadPrestamosBibliotecario("102345678");
        biblioteca.totalpagoBibliotecarios();
        biblioteca.especificacionesDeLibro("30247");
        estudiante1.entregarPrestamo("1234");
        prestamo1.calcularTotal();
    }
}
