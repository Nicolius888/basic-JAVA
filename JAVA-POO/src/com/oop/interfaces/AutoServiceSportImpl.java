package com.oop.interfaces;

import com.oop.Auto;
import com.oop.AutoHibrido;
import com.oop.interfaces.AutoService;

public class AutoServiceSportImpl implements AutoService {

//click derecho + implementar metodo/s.

    @Override
    public Auto crearAuto() {
        System.out.println("creating sport car");
        return new AutoHibrido(); //x ej.
    }

    //otra ves utilizamos nuestro metodo crearAuto() declarado en la interfaz AutoService
    //PERO
    //le damos distinta implementacion. =)
}
