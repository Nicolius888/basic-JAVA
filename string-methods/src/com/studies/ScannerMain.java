package com.studies;

import java.util.Locale;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        //Basic Input-Output, como ingresar y mostrar data en java.

        // ya conocemoe el clasico System.out --> este es para la Output de data
        // dentro de este tenemos muchos metodos para imprimir la data
        //el mas comun es PrintLn , que deriva de "Print Line"

        //ahora para ingresar data debemos usar System.in

        //pero antes inicialicemos el objeto de clase Scanner,
        //este nos es util para codificar y leer la entrada de system.in
        //por eso se la pasamos como arg
        Scanner input = new Scanner(System.in);

        //como logica de nuestro script, vamos a pedir un dato con sout
        System.out.println("Ingrese su nombre por favor: ");

        //podemos usar scanner con muchos de sus metodos
        //el metodo para leer una linea es Scanner.nextLine(),
        //y le asignamos su valor a una variable
        String nombre = input.nextLine();


        System.out.println("Ingrese su apellido: ");

        String apellido = input.nextLine();

        //Y ahora devolvemos el nombre con un sout
        System.out.println("Hola " + capitalize(nombre) + " " + capitalize(apellido) + "!");



    }


    public static final String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    //esto checkea si la string es nula o si tiene length, que es lo minimo e indispensable para que
    //el programa surta efecto
    //si eso se cumple recoge una substring desde el char 0 al 1 (osea solo la primera letra)
    //y lo convierte a UpperCase
    //despues lo suma a la substring que es la misma palabra pero solo empezando desde
    //el segundo index en adelante
    //( el metodo substring con un solo parametro, es pasarle un "beginIndex" mas el resto)
}


