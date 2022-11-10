package com.studies;

public class NameFormatException extends Exception {

    private static final long serialVersionUID = 1L;

    public NameFormatException(String errorMessage){
        super(errorMessage);
    }
}

//esto es una excepcion creada por nosotros,
// extiende de la clase Exception
// que es la excepcion por default que nos provee Java

//y la funcion es simplemente un constructor que devuelve un mensaje

//(Todavia nose la funcion de la linea 5 esto es codigo sacado de un ejercicio)