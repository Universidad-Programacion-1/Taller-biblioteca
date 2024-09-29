package co.edu.uniquindio.poo;
/*Alejandro Hernández
 * importar las funciones que nos servirán
 */
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
    
    public void especificacionesDeLibro(String codigoLibro, String obtenerEspecificaciones){

        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigoLibro)) {
                System.out.println("\nEspecificaciones del libro con código " + codigoLibro + ":");
                System.out.println(libro.obtenerEspecificaciones());
                break; // Salir del bucle si se encuentra el producto
            }
         }
    }
    /*Alejandro Hernández
     * Este metodo sirve para que el usuario pueda ingresar el codigo del libro que quiere buscar
     */
   
    public String  buscarLibro(){
    
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor ingrese el código del libro que desea buscar:");
            System.out.println("1. Código: 1234");
            System.out.println("2. Código: 5678");
            String codigoLibro = scanner.next();
            scanner.close();
            return codigoLibro;
            
    } 

    public void buscarNombreLibro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre del libro que desea buscar:");
        String nombreLibro = scanner.next();
        scanner.close();
        cantidadPrestamoLibro(nombreLibro);
    }
    public String cantidadPrestamoLibro(String nombreLibro){
        for(Libro libro : libros){
            if (libro.getTitulo().equals(nombreLibro)){
                System.out.println("Estos son los prestamos que tiene="+prestamos);
            }
        }
        return nombreLibro;
    }
    



    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", totalDineroRecaudo=" + totalDineroRecaudo + ", bibliotecarios="
                + bibliotecarios + ", prestamos=" + prestamos + ", libros=" + libros + ", estudiantes=" + estudiantes
                + "]";
    }

}
