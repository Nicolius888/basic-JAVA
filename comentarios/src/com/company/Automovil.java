package com.company;

public class Automovil {

    //atributos
    //e.g.: color, peso, altura, motor. etc.
    String color;
    String marca;
    String modelo;
    double peso;
    double largo;
    Integer velocidad = 0; //le damos un valor inicial SIEMPRE que creemos un new Automovil();

    //constructores
    //si no creamos constructores, habria por defecto un constructor vacio
    //no agregariamos valores a los parametros de arriba
    public Automovil(String colorete, String marca, String modelo, double peso, double largo){
        this.color = colorete;
        //el color de automovil, tiene el valor de mi parametro colorete;
        //esto es un ejemplo y por convencion siempre se pone igual, como aca sigue:
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

        //con esto hacemos el new Automovil y recibe estos argumentos.

    }

    //comportamientos
    //e.g: acelerar, girar, etc.

    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 120) { //evitamos una velocidad de valor negativo y limitamos nuestro auto a 120km/h

             this.velocidad += velocidad;

        }
    }
    //entonces con este metodo sumamos velocidad al auto.
}
