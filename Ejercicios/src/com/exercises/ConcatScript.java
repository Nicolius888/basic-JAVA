package com.exercises;
import java.util.Scanner;

public class ConcatScript {
    public static void main(String[] args) {

        String textos = "";

        //abro el scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los textos a concatenar + enter, para concatenar use el comando concat: ");

        //bucle infinito para escuchar el input
        while(true){
            String texto = input.nextLine();

            //condicion para recibir el comando de salida
            if(texto.equalsIgnoreCase("concat")){
                break;
            }

            //en cada iteracion concateno el texto nuevo
            textos = textos.concat(texto).concat(" ");
        }

        // al finalizar el loop lo unico que queda es imprimir el texto completo.
        System.out.println(textos);

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