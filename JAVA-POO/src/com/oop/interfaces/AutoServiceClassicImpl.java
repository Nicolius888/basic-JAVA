package com.oop.interfaces;

import com.oop.Auto;
import com.oop.AutoElectrico;
import com.oop.interfaces.AutoService;

public class AutoServiceClassicImpl implements AutoService {

    //esta implementacion nos va a dar error hasta que le demos un cuerpo al metodo de la interfaz
    //i.e: las clases que implementan interfaces, estan obligadas a proporcionar un cuerpo para las mismas.

    @Override
    public Auto crearAuto() {
        System.out.println("creating classic car");
        return new AutoElectrico();
    }




}
