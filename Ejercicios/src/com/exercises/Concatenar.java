package com.exercises;

public class Concatenar {
    public static void main(String[] args) {

        /*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
        Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
        String[] nombres = {"", "", "", ""}*/

        String[] oraciones = {"Lorem ipsum dolor sit amet,","at mea utamur sapientem,", "cum stet pericula no."};

        //metodo for each

        String texto = "";

        for(String oracion : oraciones){
            texto = texto.concat(oracion).concat(" ");
        }

        System.out.println(texto); //Lorem ipsum dolor sit amet, at mea utamur sapientem, cum stet pericula no.

    }
}
