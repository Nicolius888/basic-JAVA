package com.exercises;
import java.util.Scanner;

public class ConcatScript {
    public static void main(String[] args) {

        String textos = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los textos a concatenar + enter, para concatenar use el comando concat: ");

        while(true){
            String texto = input.nextLine();
            if(texto.equalsIgnoreCase("concat")){
                break;
            }
            textos = textos.concat(texto).concat(" ");
        }

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