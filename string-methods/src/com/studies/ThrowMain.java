package com.studies;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try{
            leerNombres();
        } catch (NameFormatException e){
            e.printStackTrace();
        }

    }
        //Como arrojar nuestras propias excepciones (errores en el catch)

        //vamos a crear un metodo que recibe un nombre por consola y verifica que tenga
        //longitud mayo o igual a 8 chars
        //si no se cumple la condicion, arrojamos nuestra excepcion previamente creada.

        public static void leerNombres() throws NameFormatException {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba su nombre: ");

            while (teclado.hasNext()) {
                System.out.println("Escriba su nombre: ");
                String nombre = teclado.nextLine();

                if (nombre.length() < 8) {
                    teclado.close();
                    throw new NameFormatException("El nombre debe contener un minimo de 8 caracteres.");
                }
            }
            teclado.close();

        }

        //Entonces:
            //throws: es para indicar, como se ve seguido a la declaracion del metodo,
            //que existe la posibilidad de que el metodo arroje la excepcion.

            //throw: en cambio, ya es para arrojar la excepcion en si.

        //Lo importante de arrojar ese excepcion es que en algun punto sea capturada y gestionada
        //para eso necesitamos en catch, si no de nada serviria arrojar excepciones.

    }

