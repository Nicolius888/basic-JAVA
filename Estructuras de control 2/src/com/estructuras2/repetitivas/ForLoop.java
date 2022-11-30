package com.estructuras2.repetitivas;

public class ForLoop {
    public static void main(String[] args) {

        //basic for loop

        for(int i = 1; i<= 20; i++){
            System.out.println("i value is " + i);
        }

        String[] letras = {"a", "b", "c", "d", "e", "f"};

        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        int[] numbers = {7,3,8,4,9};
        int suma = 0;
        for(int i = 0 ; i < numbers.length; i++){
        suma += numbers[i];
        }
        System.out.println(suma); //31





    }
}
