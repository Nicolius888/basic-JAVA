package com.studies;

import java.util.ArrayList;
import java.util.List;
//lists siempre vienen del paquete java.util

public class ListsMain {

    public static void main(String[] args) {

        //Lo primero a tener en cuenta: List es una INTERFASE

    //  List + <tipo> + ID = new claseDeLista<>();

        List<String> nombres = new ArrayList<>();

        //las listas son como arrays pero no estaticos, son mas maleables,

        //ya instanciada nuestra lista, podemos usar sus metodos

        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");
        nombres.add("nombre5");

        //a diferencia de los arrays,
        //podemos agregar tantos elementos como quisieramos sin preocuparnos por la cantidad.

        //otra cosa distinta que no podemos con arrays
        System.out.println(nombres); //[nombre1, nombre2, nombre3, nombre4, nombre5]

        //otra manera de imprimir los valores uno a uno
        //bucle for each
        for(String name : nombres){
            System.out.println(name);
        }

        //esto es: name es una variable temporal que funciona como index,
        //pero a la ves se le asigna el valor de ese indice
        //y el indice corresponde a la lista que le demos como segundo parametro, aca seria nombres.

        //tambien disponible para arrays
        String[] miArray = new String[]{
            "pepe", "paco", "manolo"
        };

        for(String el : miArray){
            System.out.println(el);
        }



        //podemos usar tambien nuestras clases

        List<Automovil> Autos = new ArrayList<>(); // observar que es lista de automoviles pero, la instancia es sobre arrayList...

        //una ves creada funciona como una lista normal, en este caso para agregar automoviles
        //le pasamos el constructor

        Autos.add( new Automovil("Honda Civic") );
        Autos.add( new Automovil("Fiat Uno") );

        System.out.println(Autos);  //si la clase automoviles no tiene generado el metodo toString()
                                    //al imprimir la lista solo obtenemos la posicion en memoria de los elementos
                                    //con toString(), funciona !

        //o funciona con bucle for Each
        //pero pasandole el tipo Automovil

        for(Automovil e : Autos){
            System.out.println(e.name);
        }



    }


}
