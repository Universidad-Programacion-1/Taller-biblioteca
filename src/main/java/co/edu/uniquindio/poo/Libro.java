package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {

    private String codigo, isbn, autor, titulo, editorial;
    private int unidadesDisponibles;
    private LocalDate fechaPublicacion;
    private boolean estado;
    private double precio;
    //private DetallePrestamo detallePrestamo;
    
    
    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, int unidadesDisponibles,
            LocalDate fechaPublicacion, boolean estado, double precio) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.unidadesDisponibles = unidadesDisponibles;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.precio = precio;
    }

    

    /*Alejandro Hernández
     * Método para solicitar la cantidad de libros
     */
    
    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public String getEditorial() {
        return editorial;
    }



    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }



    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }



    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }



    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }



    public boolean isEstado() {
        return estado;
    }



    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    public double getPrecio() {
        return precio;
    }



    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /*Alejandro Hernandez
     * metodo para agregar prestamo al libro
     */
    


    /*Alejandro Hernandez
     * metodo solicitar cantidad de libros que hay 
     */
    public boolean solicitarCantidad(int cantidadSolicitada) {
        if (cantidadSolicitada > unidadesDisponibles) {
            System.out.println("No hay suficiente cantidad disponible.");
            return false; // No se puede completar la solicitud
        }
        
        unidadesDisponibles -= cantidadSolicitada; // Disminuir la cantidad
        System.out.println("Se han solicitado " + cantidadSolicitada + " unidades de " + titulo );
        return true; // Solicitud completada con éxito
    }
    /*Alejandro Hernández
     * Este metodo sirve para obtener todas las especificaciones de estos libros
     */
    public String obtenerEspecificaciones(){
        return "Código:"+ codigo + "\n" + "isbn:"+ isbn + "\n" + "autor"+autor+"/n"+"estado"+estado+"/n"+"fecha de publicación"+fechaPublicacion+"/n"+"titulo"+titulo+"/n"+"editorial"+editorial+"/n"+"unidades disponibles"+unidadesDisponibles;
        
    }



    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", unidadesDisponibles=" + unidadesDisponibles + ", fechaPublicacion=" + fechaPublicacion
                + ", estado=" + estado + ", precio=" + precio + "]";
    }

    
    
   

    
}
