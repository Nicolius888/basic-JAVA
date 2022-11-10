package com.company;

public class ifElse {
    public static void main(String[] args) {

        boolean check = 5 > 10;

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if(num1 < num2 && num2 < num3) {
            System.out.println("True !");
        } else {
            System.out.println("False :/");
        }

        //one liner if cases
        if(num1 < num2)System.out.println("yep.");

        //its basically the same old syntax, if, else if, one liner if, accepts && and ||...

    }
}
