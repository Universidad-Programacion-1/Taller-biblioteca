package co.edu.uniquindio.poo;
/*Alejandro Hernández
 * importar las funciones que nos servirán
 */
import java.time.Period;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
/*Alejandro Hernandez
 * clase de biblioteca para crear todos los objetos
 */
public class Biblioteca {
    private String nombre;
    private double totalDineroRecaudo;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private Collection<Libro> libros;
    private Collection<Estudiante> estudiantes;
    /*Alejandro Hernández
     * metodo del constructor para los objetos de esta clase 
     */

    public Biblioteca(String nombre, double totalDineroRecaudo) {
        this.nombre = nombre;
        this.totalDineroRecaudo = totalDineroRecaudo;
        bibliotecarios = new LinkedList<>();
        prestamos = new LinkedList<>();
        libros = new LinkedList<>();
        estudiantes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalDineroRecaudo() {
        return totalDineroRecaudo;
    }

    public void setTotalDineroRecaudo(double totalDineroRecaudo) {
        this.totalDineroRecaudo = totalDineroRecaudo;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }


    /*Alejandro Hernández
     * Método para agregar libro a la lista libros
     */
    public void agregarLibro(Libro libro) {
        if (!verificarLibro(libro.getCodigo())) {
            libros.add(libro);
        }
    }


    /*Alejandro Hernández
     * Esta función sirve para verificar que no hayan libros repetidos por su mismo código
     */
    public boolean verificarLibro(String codigo) {
        boolean centinela = false;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }


    /*Alejandro Hernández
     * Función para reemplazar un libro por otro
     */
    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
                break;
            }
        }
    }


    /*Alejandro Hernández
     * Este metodo sirve para mostrar todas las especificaciones de un libro según su código
     */
    public void especificacionesDeLibro(String codigoLibro){

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                System.out.println(libro.obtenerEspecificaciones());
                break; // Salir del bucle si se encuentra el producto
            }
         }
    }


    /*Alejandro Hernández
     * Este metodo sirve para que el usuario pueda ingresar el codigo del libro que quiere buscar
     */
    public void  buscarLibro(String codigo){
            for (Libro libro : libros) {
                if (libro.getCodigo().equals(codigo)) {
                    System.out.println("Este es el libro ="+libro);
                }
            }
            
    } 


    /*Alejandro Hernández
     * Este metodo sirve para buscar el nombre de un libro
     */
    public void buscarNombreLibro(String nombre){
        for(Libro libro : libros){
            if (libro.getTitulo().equals(nombre)){
                System.out.println(libro);
            }
        }
    }

    /*Alejandro Hernández
     * Este metodo sirve para saber cuantos prestamos tiene libro
     */
    public String cantidadPrestamoLibro(String nombreLibro){
        for(Libro libro : libros){
            if (libro.getTitulo().equals(nombreLibro)){
                System.out.println("Estos son los prestamos que tiene="+prestamos);
            }
        }
        return nombreLibro;
    }


    /*Alejandro Hernández
     * Este metodo sirve para obtener el salario del bibliotecario
     */
    public void totalpagoBibliotecarios(){
        for (Bibliotecario bibliotecario : bibliotecarios) {
            double total_prestamo = 0;
            double total_bonificacion = 0;
            for (Prestamo prestamo : prestamos) {
                if (prestamo.getBibliotecario().getNombre().equals(bibliotecario.getNombre())) {
                    total_prestamo += prestamo.calcularTotal()*0.20;
                }
            }
            LocalDate hoy = LocalDate.now();
            Period periodo = Period.between(bibliotecario.getFechaIngreso(), hoy);
            total_bonificacion = periodo.getYears()*0.02;

            double total = total_bonificacion + total_prestamo;
            System.out.println("Este es el nombre bibliotecario="+bibliotecario.getNombre() +" este es el dinero a pagar: "+total);
        }
    }


    /*Alejandro Hernández
     * Este metodo sirve para agregar un bibliotecario y mandarlo a una lista
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario){
        bibliotecarios.add(bibliotecario);
    }

    /*Alejandro Hernández
     * Este metodo sirve para agregar un estuidiante y mandarlo a una lista
     */
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }


    /*Alejandro Hernández
     * Este metodo sirve para mostrar la cantidad de prestamos de un bibliotecario
     */
    public void mostrarCantidadPrestamosBibliotecario(String cedula){
        int conntador = 0;
        for (Bibliotecario bibliotecario : bibliotecarios) {
            for (Prestamo prestamo : bibliotecario.getPrestamos()) {
                conntador += 1;
            }
            System.out.println("El blibliotecario "+ bibliotecario.getNombre()+ " hizo "+conntador+ " prestamos");
        }
    }

    /*Alejandro Hernández
     * Este metodo sirve para crear un estudiante y mandarlo a una lista
     */
    public void mostrarCantidadPrestamosEstudiante(String cedula){
        int conntador = 0;
        for (Estudiante estudiante : estudiantes) {
            for (Prestamo prestamo : estudiante.getPrestamos()) {
                conntador += 1;
            }
            System.out.println("El Estudiante "+ estudiante.getNombre()+ " hizo "+conntador+ " prestamos");
        }
    }

    /*Alejandro Hernández
     * Este metodo sirve para crear un bibliotecario y mandarlo a una lista
     */
    public void crearPrestamo (Prestamo prestamo){
        System.out.println("prestamos"+prestamo);
        for (DetallePrestamo detallePrestamo : prestamo.getDetallePrestamos()) {
            if (prestamo.verificarEstadoLibro(detallePrestamo.getLibro().getCodigo())) {
                prestamos.add(prestamo);   
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }
}
