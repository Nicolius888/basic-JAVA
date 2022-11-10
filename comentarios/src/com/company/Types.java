package com.company;

public class Types {

    public static void main(String[] args) {

        //to declare variables:

        // type identifier = value
        int myNumber = 30;

        //      or

        //type identifier
        String myName;
        //then initialize as
        //identifier = value
        myName = "nico";

        //integers           //storage capacity:
        byte number1 = 1;   //1 byte
        short number2 = 2;  //2 bytes
        int number3 = 3;    //4 bytes
        long number4 = 4;   //8 bytes

        //floating point
        float decimal1 = 4.9f; // without the f  we get a found double require float error //less storage capacity
        double decimal2 = 5.9d; //here's not necessary the d                               //more storage capacity

        //character
        char justALetter = 'a'; //'' not "" (?)

        //bool
        boolean yes = true; //observe the color in true and false, this are reserved words
        boolean no = false;

        //strings
        String name = "nico";
        String surname = "Sammaritano"; //see how String it's not a primitive Java type, but a class

        //wrapper types

        //the primitives (starting with lower caps), they can't be null
        //int myNum = null; //error

        //but you can do this with class types (starting with caps).
        Integer number5 = null;
        Long number6 = 2L; //L is for long, not always needed







    }
}
