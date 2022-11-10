package com.oop;

public class AutoMain {


    public static void main(String[] args) {

        //Auto miAuto = new Auto("rojo", "BMW","A130", 200.90, 2.0);
        //al hacer de Auto una clase abstracta,
        //solo permitimos usar las clases hijas de Auto
        //como si quisieramos dejar por un lado el concepto de auto, a la que los autos reales perteneces
        //estamos obligados entonces a instancias los autos dentro de categorias mas especificas
        //e.g. auto de combustion, electrico, hibrido etc.

        Auto miAuto = new AutoElectrico("rojo", "BMW", "A130", 200.90, 2.0, "Tesla");
        //Gracias al polimorfismo, podemos usar el tipo o clase base Auto, pero creando nueca instancia de AutoElectrico.

        miAuto.acelerar(80);

        System.out.println(miAuto);

        //los atributos pueden sobreescribirse

        miAuto.peso = 150.30;

        System.out.println(miAuto); //ahora el peso es 150.30


        AutoElectrico miAutoElectrico = new AutoElectrico("Tesla motor");
        miAutoElectrico.motorElectrico = "algo";
        miAutoElectrico.color = "azul";
        miAutoElectrico.peso = 50.20;
        miAutoElectrico.acelerar(90);

        System.out.println(miAutoElectrico);

        //creado con implementacion del super
        AutoElectrico miAutoElectrico2 = new AutoElectrico("verde", "honda", "civic", 43d, 2d, "Z9000");

        //OVERRIDE/SOBRESCRITURA
        //podemos usar el metodo heredado tal cual, e.g. "acelerar"
        miAutoElectrico2.acelerar(50);
        //pero recordemos que para auto electrico sobreescribimos para acelerar de una forma especifica y unica de autos electricos

        System.out.println(miAutoElectrico2);
    }
}
