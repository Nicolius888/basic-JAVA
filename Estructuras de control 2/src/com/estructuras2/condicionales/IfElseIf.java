package com.estructuras2.condicionales;

import javax.swing.*;

public class IfElseIf {

    //En E. de control, la mejor practica cuando comparando elementos
    //es usar equals para Strings y == para numeros, como vemos aqui:
    public static void main(String[] args) {


        String dia = "Lunes";
        String dia2 = "Martes";

        boolean result = dia.equals(dia2);
        boolean result2 = 5 == 5;


        if (dia.equals("Lunes")) {
            System.out.println("Feliz inicio de semana, colega!");
        } else if (dia.equals("Martes")) {
            System.out.println("Bring the coffee...");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Mitad de semana...");
        } else if (dia.equals("Jueves")) {
            System.out.println("Feliz Jueves!");
        } else if (dia.equals("Viernes")) {
            System.out.println("Buen Finde!");
        } else {
            System.out.println("Ingrese un dia valido.");
        }

    }
}
