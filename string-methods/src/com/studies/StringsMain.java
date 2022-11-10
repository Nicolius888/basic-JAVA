package com.studies;

public class StringsMain {
    public static void main(String[] args) {

        //String se declara siempre con mayusculas, es una clase

        //utiliza "comillas dobles", las comillas simples se utilizan para el type 'CHAR', osea caracter.

        //la estructura es tipo-identificador-valor
        String name = "nico";

        String mensaje = "Hello World!";

        System.out.println(mensaje.length()); // longitud

        //recordemos que estos metodos simplemente RETORNAN un valor
        //la variable original queda intacta, podriamos si quisieramos evitar eso
        //almacenar el valor en otra variable, o incluso sobreescribir la original.
        //pero logicamente la primera es la mejor practica.

        String mensajeUP = mensaje.toUpperCase();
        System.out.println(mensajeUP);

        //para borrar espacios innecesarios o excesivos -- trim()
         String dataFromFrontend = "   Hello World!     ";
        System.out.println(dataFromFrontend.trim());

        //comprobar igualidad
        //por defecto equels() es case sensitive

        if(mensaje.equals(mensajeUP)){
            System.out.println("True");
        } else {
            System.out.println("False"); //entonces retorna false.
        }

        //pero con equalsIgnoreCase() tenemos case un-sensitive
        if(mensaje.equalsIgnoreCase(mensajeUP)){
            System.out.println("True");
        } else {
            System.out.println("False"); // entonces retorna true.
        }





    }
}