package org.aguzman.pooherencia.ejemplo;

import org.aguzman.pooherencia.pooherencia.Alumno;
import org.aguzman.pooherencia.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.pooherencia.Persona;
import org.aguzman.pooherencia.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println(" ====== Creando la instancia de la clase alumno ======");
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("abdres@correo.com");

        System.out.println("====== Creando la instancia de la clase alumnointernacional ======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("====== Creando la instancia de la clase de profesor ======");
        Profesor profesor = new Profesor("Luci", "Perez", "Matemáticas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println("====== . ======");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

        }

        public  static void imprimir(Persona persona){
            System.out.println("====================================");
            System.out.println(persona);
        }
    }
