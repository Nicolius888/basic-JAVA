package com.exercises;

public class Main {
    public static void main(String[] args) {

        /*
        Para este primer ejercicio tendréis que realizar lo siguiente:
        Crea un proyecto de Java desde 0
        Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
        Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
        Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
        */


        //tipos primitivos ejemplos:

        byte myByte = 100;
        System.out.println(myByte);

        short myShort = 10000;
        System.out.println(myShort);

        int myInt = 1000000000;
        System.out.println(myInt);

        long myLong = 100000L;
        System.out.println(myLong);

        float myFloat = 123.112f;

        double myDouble = 123.123123;
        System.out.println(myDouble);

        char myChar = 'J';
        System.out.println(myChar);


        //----------------------------------------------------------------
        //no primitivos ejemplos:


        String myString = "Hello World!";
        System.out.println(myString);

        String[] myArray = new String[]{"Hello", "World", "!"};

        for(String el : myArray){
            System.out.println(el);
        }

        Auto myAuto = new Auto("Auto Uno");
        System.out.println(myAuto.name);













    }
}