package com.oop.interfaces;

import com.oop.Auto;

public class InterfacesMain {
    public static void main(String[] args) {

        //aca implementamos los metodos ya declarados usando las interfaces

        //funciona igual a crear objetos
        //la interfaz funciona como el tipo base y sobre ella hacemos las "new" instancias.

        AutoService service = new AutoServiceClassicImpl();
        AutoService service1 = new AutoServiceSportImpl();
        // i.e.: usar la interfaz AutoService en su implementacion X o Y


        //se ve como con las interfaces mucho mas naturalmente utilizamos el polimorfismo.

        //podriamos usarlas como a un metodo constructor (xq esa funcion les dimos en este ejemplo)

        Auto newElectricSport = service1.crearAuto();
        Auto newHibridClassic = service.crearAuto();


        //entonces como cada implementacion tiene un metodo contstructor podemos invocarlas
        //y guardarlas en una variable de tipo auto. Mas polimorfismo.



        //un claro ejemplo de uso de interfaces es usando bases de datos,
        //podriamos realizar la misma tarea pero con diferentes implementaciones
        //segun que tipo de DB usemos
        //e.g. un tipo de interfaz get all, que tenga los mismos metodos para diferentes tipo de DB
        //get all's para PostgresSQL, para Cassandra, MySQL, etc.

    }
}
