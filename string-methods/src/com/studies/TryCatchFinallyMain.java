package com.studies;

public class TryCatchFinallyMain {

    public static void main(String[] args) {

        //en caso de que una operacion detenga el codigo con un error

        //como podria ser un caso donde dividimos por cero
        // esto nos da una "ArithmeticException"
        //para eso envolvemos en try catch

        try {
            int miNum = 5 / 0;
        } catch(ArithmeticException e){     //el valor default es capturar la excepcion, con el tipo Exception mas un ID
                                            // pero siempre que sepamos el tipo de error
                                            //es mejor aclarar
         e.printStackTrace();               //este es un metodo para logear el stack del error, hay mas formas.
                                            //lo importante de el metodo para imprimir es que
                                            //si bien el try catch ya deja continuar el codigo a pesar del error
                                            //con el metodo de "printeo" obtenemos detalle del error
        } finally {
            System.out.println("cierre de recursos");
        }


        //finally siempre se ejecuta, halla o no error
        // la idea general es que try lo usamos para eventos que pueden fallas
        //como conexiones a servicios externos, servers, databases etc.
        //con catch hariamos un seguimieto del error si lo hubiese
        //y Siempre, con o sin error con finally
        //limpiar el entorno, terminar conexiones, acciones, etc, lo que sea necesario.


        System.out.println("fin");

        //ahora el programa falla, pero el codigo no detiene su ejecucion e imprimimor el "fin" en linea 20.



    }
}
