package com.exercises;
import java.util.Scanner;

public class ConcatScript {
    public static void main(String[] args) {

        String textos = "";

        Scanner input = new Scanner(System.in);                   //abro el scanner

        System.out.println("Ingrese los textos a concatenar + enter, para concatenar use el comando concat: ");

        while(true){                                              //bucle infinito para escuchar el input
            String texto = input.nextLine();
            if(texto.equalsIgnoreCase("concat")){  //condicion para recibir el comando de salida
                break;
            }
            textos = textos.concat(texto).concat(" ");       //en cada iteracion concateno el texto nuevo
        }

        System.out.println(textos);                               // al finalizar el loop lo unico que queda es imprimir el texto completo.

    }
}

/*Input:
Lorem ipsum dolor sit amet,
at mea utamur sapientem,
cum stet pericula no.
concat

Ouptut:
Lorem ipsum dolor sit amet, at mea utamur sapientem, cum stet pericula no.
*/