package co.edu.uniquindio.poo;

import java.util.Date;

public class Bibliotecario extends Persona{
    
    private int salarioBibliotecario;
    private Date fechaContratacion;

    public Bibliotecario( Persona persona, int salarioBibliotecario, Date fechaContratacion) {
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
