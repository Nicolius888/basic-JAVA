package com.studies;

import java.util.HashMap;
import java.util.Map;

public class MapMain {


    public static void main(String[] args) {


        //Map al igual que listas hay que instanciarlo, pero
        //tiene la particularidad de trabajar en formato Clave-Valor entonces se declaran asi:

        Map<String, String> personas = new HashMap<>();   //hay muchas clases para mapas
        //2 tipos, uno para la key otro-para el value

        personas.put("nombre", "juan");
        personas.put("nombre2", "juan2");
        personas.put("nombre3", "juan3");

        System.out.println(personas);

        //se podria hacer incluso con clases creadas

        Map<String, Automovil> Autos = new HashMap<>();

        Autos.put("auto 1", new Automovil("Honda Civic"));
        Autos.put("auto 2", new Automovil("BMW C130"));
        Autos.put("auto 3", new Automovil("Lambo Diablo"));


        System.out.println(Autos);

        //para iterar con el for each:

        //imprimir las keys:
        //el elemento sera una string como el primer tipo de nuestro Map
        //y con el metodo de map .keySet() obtenemos un set con todas las key, para poder iterar sobre ellas
        for(String key : Autos.keySet()){
            System.out.println(key);
        }

        //auto 2
        //auto 1
        //auto



        //imprimir los values:
        //same pero con .values() y en este caso tipo Automovil para iterar
        for(Automovil e : Autos.values()){
            System.out.println(e.name);
        }

        //BMW C130
        //Honda Civic
        //Lambo Diablo


        //imprimir el par key-value!
        //tenemos que importar Map.Entry de Java.util (IMPORTANTE)
        //pasarle los tipos de mi map
        // e iterar sobre el metodo .entrySet()
        for(Map.Entry<String, Automovil> el : Autos.entrySet()){
            System.out.println(el.getKey() + " / " + el.getValue().name);  //luego obtenemos cada key y cada value
                                                                           //con getKey y getValue
            //name es solo x el formato de este ejemplo automovil.
        }
    }
}