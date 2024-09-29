package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase que representa un préstamo de libros en una biblioteca.
 * Contiene información sobre el préstamo, incluyendo las fechas, el bibliotecario,
 * el estudiante y los detalles de los libros prestados.
 */
public class Prestamo {

    private String codigo; // Código único del préstamo
    private LocalDate fechaPrestamo; // Fecha en que se realizó el préstamo
    private LocalDate fechaEntrega; // Fecha en que se debe devolver el préstamo
    private double total; // Total calculado del préstamo
    private Bibliotecario bibliotecario; // Bibliotecario que maneja el préstamo
    private Estudiante estudiante; // Estudiante que recibe el préstamo
    private Collection<DetallePrestamo> detallePrestamos; // Detalles de los libros prestados


    public Prestamo(String codigo, LocalDate fechaPrestamo, LocalDate fechaEntrega, Bibliotecario bibliotecario,
            Estudiante estudiante) {
        this.codigo = codigo; // Inicializa el código del préstamo
        this.fechaPrestamo = fechaPrestamo; // Inicializa la fecha de préstamo
        this.fechaEntrega = fechaEntrega; // Inicializa la fecha de entrega
        this.detallePrestamos = new LinkedList<>(); // Inicializa la colección de detalles de préstamo
        this.total = calcularTotal(); // Calcula el total del préstamo
    }

    /**
     * Método que calcula el total del préstamo sumando los subtotales de los detalles.
     *
     * @return El total calculado del préstamo.
     */
    public double calcularTotal() {
        double total = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamos) {
            total += detallePrestamo.getSubTotal(); // Suma cada subtotal de los detalles
        }
        return total; // Retorna el total calculado
    }

    // Métodos getters y setters para acceder y modificar los atributos

    public String getCodigo() {
        return codigo; // Retorna el código del préstamo
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo; // Establece el código del préstamo
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo; // Retorna la fecha de préstamo
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo; // Establece la fecha de préstamo
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega; // Retorna la fecha de entrega
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega; // Establece la fecha de entrega
    }

    public double getTotal() {
        return total; // Retorna el total del préstamo
    }

    public void setTotal(double total) {
        this.total = total; // Establece el total del préstamo
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario; // Retorna el bibliotecario
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario; // Establece el bibliotecario
    }

    public Estudiante getEstudiante() {
        return estudiante; // Retorna el estudiante
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante; // Establece el estudiante
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos; // Retorna la colección de detalles de préstamo
    }

    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos; // Establece la colección de detalles de préstamo
    }

    /**
     * Método que devuelve una representación en cadena del objeto Prestamo.
     *
     * @return Cadena que representa el préstamo y sus detalles.
     */
    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaPrestamo=" + fechaPrestamo + ", fechaEntrega=" + fechaEntrega
                + ", total=" + total + ", bibliotecario=" + bibliotecario + ", estudiante=" + estudiante
                + ", detallePrestamos=" + detallePrestamos + "]"; // Devuelve la información del préstamo
    }

}
