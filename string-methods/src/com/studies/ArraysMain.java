package com.studies;

public class ArraysMain {
    public static void main(String[] args) {

        String name1 = "name1";
        String name2 = "name2";
        String name3 = "name3";
        String name4 = "name4";
        String name5 = "name5";

        String[] names = new String[3];
        //en este caso le indico que mi array va a estar fijo en 5 elementos

        //Tambien pueden ser de otro tipo
        int[] numbers = new int[3];

        //incluso funciona con nuestras propias clases
        Automovil[] auto = new Automovil[2];

        //Formas de uso
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        // names[3] = name4; out of bond error, xq excedemos la length de nuestro array.

       //imprimir resultados 1 x 1
        for (int i=0; i < names.length; i++){     //el metodo length de array es sin "()"//.LENGTH no .LENGTH()
            System.out.println(names[i]);
        }

        //otra manera de declarar arrays
        //analoga a esta : String[] names = new String[3];

        String[] names1 = new String[]{name1, name2, name3, name4, name5};

        //explicitamente le damos la length y los elementos a la vez.
        System.out.println(names1.length);

        //names[5] = "hi"; no podemos seguir agregando, out of bond error.

        //al igual que con strings podemos declarar arrays de nuestras propias clases
        Automovil[] autos = new Automovil[3];

        //RECORDAR: los arrays son estaticos, la cantidad de elementos declarada
        //es la cantidad de elementos que va a aceptar siempre.

        //investigar metodos de arrays.




    }
}
