package com.oop;

public abstract class Auto {  //ver auto main para explicacion de ABSTRACT.

        //ATRIBUTOS
        //son variables, valores de nuestro objeto
        //e.g.: color, peso, altura, motor. etc.
        String color;
        String marca;
        String modelo;
        double peso;
        double largo;
        Integer velocidad = 0; //le damos un valor inicial SIEMPRE que creemos un new Automovil();



        //CONSTRUCTORES
        //son setters iniciales, para cuando construimos nuestro objeto.

        //si no creamos constructores, habria por defecto un constructor vacio
        //tendriamos efectivamente los atributos declarados pero sin valores asignados.

        public Auto(){}      //esto sirve para poder construir un new objeto() pero sin declarar los atributos,
                              // el caso siguiente es para lo contrario.

        public Auto(String colorete, String marca, String modelo, double peso, double largo){
            this.color = colorete;
            //el color de automovil, tiene el valor de mi parametro colorete;
            //esto es un ejemplo y por convencion siempre se pone igual, como aca sigue:
            this.marca = marca;
            this.modelo = modelo;
            this.peso = peso;
            this.largo = largo;

            //this.color hace referencia a nuestro atributo ya declarado,
            //y le damos como valor el parametro recibido en la funcion contructora al ser invocada.
            //con esto hacemos el tipico new Auto(blablabla...)

        }

        //COMPORTAMIENTOS
        //e.g: acelerar, girar, etc.
        //son metodos que va a tener cada uno de nuestros objetos construidos
        //funciones como setters y getters para alterar los atributos que queramos
        //podriamos construir un auto dandole un parametro inicial como
        // new Auto("rojo");
        //y con un setter modificarlo:
        //Auto.setColor(azul);

        public void acelerar(Integer cantidad){
            if (cantidad > 0 && cantidad <= 120) { //evitamos una velocidad de valor negativo y limitamos nuestro auto a 120km/h

                this.velocidad += cantidad;

            } else if (cantidad > 120) {
                this.velocidad = 120;
            }
        }
        //entonces con este metodo sumamos velocidad al auto (y de paso le definimos una velocidad maxima).

        @Override //left click + generate + select all with ctrl + ent
                  //this case is to format the sout.
        public String toString(){
            return "Auto{" +
                    "color='" + color + "\'" +
                    ", marca='" + marca + "\'" +
                    ", modelo='" + modelo + "\'" +
                    ", peso=" + peso +
                    ", largo=" + largo +
                    ", velocidad=" + velocidad +
                    '}';
        }
    }
    //Ver siguiente Auto Main, después AutoElectrico.


