package com.estructuras2.repetitivas;

public class ForEach {
    public static void main(String[] args) {

        //Sirve para la tipica iteracion sobre elementos, pero nos da una syntax mas simple.

        String[] names = {"paco", "juan", "josele", "tito"};

        //solo tenemos que declarar la variable con su respectivo tipo como haciamos con "i"
        //pero en ves de siempre usar un numero, usamos los elementos directamente.
        for (String name : names) {
            System.out.println(name);
        }
        //entonces, esto es como decir for each name in names ... do this ...

        int suma = 0;
        int[] numeros = {6,3,6,7,4,2,6};

        for(int numero : numeros){
            suma += numero;
        }
        System.out.println(suma);




    }
}
