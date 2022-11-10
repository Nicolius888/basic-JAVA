package com.studies;

public class Automovil {

    String name = "nombre de automovil";

    public Automovil(){}

    public Automovil(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "name='" + name + '\'' +
                '}';
    }
}
