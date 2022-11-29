package com.exercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PrecioIVA {

    public static void main(String[] args) {

        /*
        Para este ejercicio tendréis que crear una función
        que reciba un precio y devuelva el precio con el IVA incluido.

        Voy a utilizar la formula de IVA clasica al 21%
        1000/100
        10
        21*10
        210     //si tomo 21 de cada 100 en 1000, obtengo 210, es decir, el 21 por ciento de 1000.
        precio 1000 + 210 de IVA
        = 1210
        Esto se ejecuta en la funcion publica iva en linea 54.
         */

        DecimalFormat df = new DecimalFormat("0.00");//Para formatear los dobles a solo 2 decimales.
                                                              //solo valido para imprimir el output.
                                                              //en memoria nos queda el numero completo.


        Scanner input = new Scanner(System.in);               //abrimos la input.

        System.out.println("Ingrese el precio neto: ");

        String precio = input.nextLine();                     //guardamos la input.

        double precioNeto = Double.parseDouble(precio);       //parseamos la input a doble.

        double precioFinal = iva(precioNeto);                 //calculamos el iva.


        System.out.println("El precio + IVA es: $" + df.format(precioFinal)); //imprimimos.




/*
ejemplos:
ingresando 15.99 obtenemos un $19.35
ingresando un 1000 obtenemos un $1210.00
 */



    }

    public static double iva(double precioNeto){
        double precioFinal = precioNeto + ((precioNeto/100)*21);
        return precioFinal;

    }


}
