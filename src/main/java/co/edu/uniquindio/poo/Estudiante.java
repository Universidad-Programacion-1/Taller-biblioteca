package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Persona {

    private boolean estado;
    private Collection<Prestamo> prestamos;

    public Estudiante(String nombre, String cedula, String correo, int telefono, boolean estado) {
        super(nombre, cedula, correo, telefono);
        this.estado = estado;
        prestamos = new LinkedList<>();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Estudiante [estado=" + estado + ", prestamos=" + prestamos + "]";
    }


    /**
    * Este método se encarga de validar que se entrego el prestamo
    * @param 
    * @return retorna verdadero si entrego el prestamo 
    */
    public boolean entregarPrestamo(String id){
        boolean centinela = false;
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(id)){
                prestamos.remove(prestamo);
                centinela = true;
            }
        }
        return centinela;
    }
}
