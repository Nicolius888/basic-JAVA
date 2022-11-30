package com.estructuras2.condicionales;

public class SwitchSentence {
    public static void main(String[] args) {

        String dia  = "Jueves";

        switch(dia){
            case "Lunes":
                System.out.println("Feliz semana!, es lunes.");
                break;
            case "Martes":
                System.out.println("Estamos en martes!");
                break;
            case "Miercoles":
                System.out.println("Estamos en miercoles!");
                break;
            case "Jueves":
                System.out.println("Feliz jueves!");
                break;
            case "Viernes":
                System.out.println("Buen Finde...");
                break;
            default:
                System.out.println("Ingrese un dia valido.");
                break;
        }


    }
}
