package org.aguzman.pooherencia.ejemplo;

import org.aguzman.pooherencia.pooherencia.Alumno;
import org.aguzman.pooherencia.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.pooherencia.Persona;
import org.aguzman.pooherencia.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
            System.out.println("Imprimiendo datos en común del tipo persona");
            System.out.println("nombre : " + persona.getNombre()
                    + ", apellido: " + persona.getApellido()
                    + ", edad: " + persona.getEdad()
                    + ", email: " + persona.getEmail());

            if (persona instanceof Alumno){
                System.out.println("Imprimiendo los datos del tipo Alumno");
                System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
                System.out.println("Nota Matemáticas : " + ((Alumno) persona).getNotaMatematicas());
                System.out.println("Nota Historia : " + ((Alumno) persona).getNotaHistoria());
                System.out.println("Nota Catellano :" + ((Alumno) persona).getNotaCastellano());

                if(persona instanceof AlumnoInternacional){
                    System.out.println("Imprimiendo los datos del tipo Alumno Internacional");
                    System.out.println("Nota idiomas :" + ((AlumnoInternacional) persona).getNotaIdiomas());
                    System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
                }
                System.out.println("================= sobre escritura promedio =====================");
                System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
                System.out.println("================= sobre escritura promedio =====================");
            }
            if (persona instanceof Profesor){
                System.out.println("Imprimiendo los datos del tipo profesor");
                System.out.println("Asignatura : " + ((Profesor) persona).getAsignatura());

            }
            System.out.println("================= sobre escritura saludar =====================");
            System.out.println(persona.saludar());
            System.out.println("======================================");
        }
    }
