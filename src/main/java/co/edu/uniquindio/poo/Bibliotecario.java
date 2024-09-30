package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Persona {

    private double salario;
    private LocalDate fechaIngreso;
    private Collection<Prestamo> prestamos;

    /**
    * Este método se encarga de crear el constructor de las clase 
    * @param
    */
    public Bibliotecario(String nombre, String cedula, String correo, int telefono, double salario, LocalDate fechaIngreso){
        super(nombre, cedula, correo, telefono);
        this.salario=salario;
        this.fechaIngreso=fechaIngreso;
        prestamos = new LinkedList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", prestamos=" + prestamos
                + "]";
    }

    /**
    * Este método se encarga de adicionar un libro a un prestamo
    * 
    */
    public void adicionarPrestamo (Prestamo prestamo, Libro libro, int cantidad){
        DetallePrestamo detallePrestamo = new DetallePrestamo(cantidad, prestamo, libro);
        prestamo.getDetallePrestamos().add(detallePrestamo);
    }

    /**
    * Este método se encarga de consultar un prestamo dado su codigo
    * @param 
    * @return retorna el prestamo que tenga el codigo 
    */
    public Prestamo consultarprestamo (String codigo){
        Prestamo prestam = null;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                return prestamo;
            }
        }
        return prestam;
    }
}
