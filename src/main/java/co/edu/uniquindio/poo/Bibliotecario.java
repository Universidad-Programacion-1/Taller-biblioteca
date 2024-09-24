package co.edu.uniquindio.poo;

import java.util.Date;

public class Bibliotecario extends Persona{
    
    private int salarioBibliotecario;
    private Date fechaContratacion;

    

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salarioBibliotecario, Date fechaContratacion) {
        super(nombre, cedula, telefono, correo);
        this.salarioBibliotecario = salarioBibliotecario;
        this.fechaContratacion = fechaContratacion;
    }

    public int getSalarioBibliotecario() {
        return salarioBibliotecario;
    }

    public void setSalarioBibliotecario(int salarioBibliotecario) {
        this.salarioBibliotecario = salarioBibliotecario;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    

    

}
