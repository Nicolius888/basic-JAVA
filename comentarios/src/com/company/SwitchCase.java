package com.company;

public class SwitchCase {
    public static void main(String[] args) {


        //same old Switch, but using break as good practice
        //default in the end as always
        //atencion a la syntax, case <palabra> : (dos puntos)

        String weather = "sunny";

        //String weather = "Sunny"; //its case sensitive

        switch(weather){
            case "sunny":
                System.out.println("El clima esta soleado");
                break; //brake es obligatorio, en el caso que entra es donde
                       //el codigo comienza a ejectarse
                       //si quitamos este, vemos como ejecuta el resto de souts.
                       // caso cloudy lo mismo pero empezando desde su linea.
            case "cloudy":
                System.out.println("El clima esta nublado");
                break;
            default:
                System.out.println("No se ah podido identificar el clima");
                break;
        }


    }
}
