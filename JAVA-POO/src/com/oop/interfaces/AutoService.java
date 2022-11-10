package com.oop.interfaces;

import com.oop.Auto;

public interface AutoService {


    //aqui unicamente declaramos metodos
    //no llevan implementacion, solo es declaracion.
    //la idea es despues crear distintas implemetnaciones para cada clase que necesitemos.


    public Auto crearAuto();

    //e.g. : esta seria una funcion publica que devuelve un objeto tipo Auto, se llama crearAuto y no recibe parametros especificos.


    //Lleva estructura tipica de funciones o metodos:
    //alcance: public //tipo de retorno: Auto (devuelve un objeto de clase auto, lo usamos como tipo)//identificador( parametros ): crearAuto( sin parametros );
    //                       pero
    //{xxxx LOS METODOS DE INTERFACE NO PUEDEN TENER CUERPO xxxx}; osea lo que va entre llaves

    //Tampoco podriamos agregar metodos de comportamiento para esta interfaz.
    //tener en cuenta que esto nos daria erros en las implemetaciones ya existentes
    //ya que estas estan obligadas a darle una implementacion a cada metodo en la interfaz referida.
    //naturalmente el IDE nos avisa de estos errores.


    //EN SINTESIS:
    //RECORDAR: estas INTERFACES, solo llevan DECLARACION,
    //la idea es aparte crear tantas implementaciones como se requiera
    //NO LLEVAN ATRIBUTOS (variables inciales), ni CONSTRUCTORES (para indicar como crear new's), ni COMPORTAMIENTOS (metodos)

    //Como la implementamos? ver archivo AutoServiceClassicImpl.java, nuestra primera implementacion.
}
