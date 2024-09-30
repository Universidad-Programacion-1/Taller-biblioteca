package co.edu.uniquindio.poo;

/**
 * Clase que representa un detalle de un préstamo de libros.
 * Contiene información sobre la cantidad de libros, el préstamo asociado,
 * el libro específico y el subtotal calculado del préstamo.
 */
public class DetallePrestamo {

    private int cantidad; // Cantidad de libros prestados
    private Prestamo prestamo; // Objeto que representa el préstamo asociado
    private Libro libro; // Objeto que representa el libro
    private double subTotal; // Subtotal del préstamo basado en la cantidad y el precio del libro


    public DetallePrestamo(int cantidad, Prestamo prestamo, Libro libro) {
        this.cantidad = cantidad; // Inicializa la cantidad
        this.prestamo = prestamo; // Inicializa el préstamo
        this.libro = libro; // Inicializa el libro
        this.subTotal = calcularSubtotal(); // Calcula el subtotal en base a la cantidad y el precio del libro
    }

    /**
     * Método que calcula el subtotal del préstamo.
     *
     * @return El subtotal calculado multiplicando la cantidad por el precio del libro.
     */
    public double calcularSubtotal() {
        return cantidad * libro.getPrecio(); // Devuelve el subtotal
    }

    // Métodos getters y setters para acceder y modificar los atributos

    public int getCantidad() {
        return cantidad; // Retorna la cantidad de libros
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; // Establece la cantidad de libros
    }

    public Prestamo getPrestamo() {
        return prestamo; // Retorna el objeto préstamo
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo; // Establece el objeto préstamo
    }

    public Libro getLibro() {
        return libro; // Retorna el objeto libro
    }

    public void setLibro(Libro libro) {
        this.libro = libro; // Establece el objeto libro
    }

    public double getSubTotal() {
        return subTotal; // Retorna el subtotal
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal; // Establece el subtotal
    }

    /**
     * Método que devuelve una representación en cadena del objeto DetallePrestamo.
     * 
     * @return Cadena que representa el detalle del préstamo.
     */
    @Override
    public String toString() {
        return "DetallePrestamo [cantidad=" + cantidad + ", prestamo=" + prestamo + ", libro=" + libro + ", subTotal="
                + subTotal + "]";
    }
    
}
