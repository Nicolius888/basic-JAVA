package com.estructuras2.repetitivas;

public class WhileLoop {
    public static void main(String[] args) {

        //La principal diferencia con el bucle for
        //es que for es un bucle determinado, la idea es tener control de
        //la cantidad de repeticiones, declaramos y sabemos cuantas veces debe repetirse.
        //En el bucle While, no tenemos ese control. Es un bulce indeterminado.

        //Por ejemplo cualquier bucle while cuya condicion sea literlamente un buleano valor true,
        //va a ser infinito siempre:
        //while(true){
        // do something
        // }

        int acc = 0;

        while(acc <= 10){
            System.out.println("bucle nro.: " + acc); //0 to 10
            acc++;
        }

        //se puede frenar desde la condicion.
        int acc2 = 0;

        while(acc2 <= 10){
            System.out.println("bucle nro.: " + acc2); //0 to 5
            acc2++;
            if(acc2 == 6){
                break;
            }
        }

        //se pueden saltear valores.
        //ejemplo para saltar numeros pares:

        int acc3 = 0;

        while(acc3 <= 10){
            if(acc3 % 2 == 0){
                acc3++;        //si en el caso de continuar no sumamos, creamos un bucle infinito.
                continue;
            };
            System.out.println("bucle nro.: " + acc3); //1,3,5,7,9.
            acc3++;           //tambien funciona sumar antes del if statement, pero asi el bucle imprime hasta 11
                              //y la linea 40 genera un poco de confusion...
                              //logicamente esto importa o no dependiendo el caso.

        }

    }
}
