package com.oop;

public class Polimorfismo {

    public static void main(String[] args) {

        //Podemos hacer esto
        //crear nuestros autos, como veniamos haciendo:

        Auto miAuto = new AutoHibrido();
        AutoElectrico miAutoElectrico = new AutoElectrico();

        //O podemos hacer esto

        Auto miAuto2 = new AutoHibrido();
        Auto miAutoElectrico2 = new AutoElectrico();

        //i.e. creamos distintas clases de autos, PERO
        //definiendolos con el mismo tipo, esto esta bueno porque
        //cualquier nuevo clase de auto que nos inventemos siempre va a heredar de la clase auto.

        //En planos generales sabemos que aunque tengan distintas mecanicas,
        //ambos son autos.

        if (miAutoElectrico2 instanceof Auto){
            System.out.println("mi auto electrico es Auto");
        }
        if(miAutoElectrico2 instanceof AutoElectrico){
            System.out.println("mi auto electrico tambien es Auto Electrico");
        }
        if(miAutoElectrico2 instanceof AutoHibrido){
            System.out.println("mi auto electrico 2 es Hibrido");
        } else {
            System.out.println("mi auto electrico 2 no es Hibrido");
        }
        if(miAuto instanceof Auto){
            System.out.println("miAuto es Auto");
        }
        if(miAuto instanceof AutoHibrido){
            System.out.println("miAuto tambien es Auto Hibrido");
        }
    }
    //La utilidad del polimorfismo es que podriamos trabajar en general con un arreglo de todos los autos
    //y esto incluiria a todas las subclases, pero tambien podriamos trabajar solo con ellas
    //i.e. trabajar solo con autos electricos o autos hibridos por ejemplo,


}
