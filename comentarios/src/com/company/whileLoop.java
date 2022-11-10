package com.company;

public class whileLoop {
    public static void main(String[] args) {

        int count = 0;

 /*       while(count < 10){
            System.out.println("Hello while, nro:" + count );//el nro 10 nunca llega a ejecutarse
            //codigo a ejecutar
            count++;
            //modificador de la variable que usamos en la condicion

    }
 */

    //lets add continue and break

/*    while(count < 10){
        count++;
                if(count == 6) continue;
                //si la condicion se cumple
                //CONTINUAMOS ya mismo en la sig iteracion
                //por eso hacemos el ++ antes del if
                //sino en la iteracion nro 6 entrariamos en bucle infinito

        System.out.println("Hello While! nro: " + count);
        //el nro 6 no se imprime.
    }*/

        while(count < 10){
            if(count == 6) break;
            count++;
            //si la condicion se cumple
            //se ROMPE el BUCLE (no el resto del codigo)
            //esto se usa para detener el bucle cuando encontramos
            //un resultado deseado

            System.out.println("Hello While! nro: " + count);
            //se imprime hasta el 6.
        }

        System.out.println("fin.");
    }
}
