package org.aguzman.pooherencia.pooherencia;

import org.aguzman.pooherencia.pooherencia.Persona;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor...");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}