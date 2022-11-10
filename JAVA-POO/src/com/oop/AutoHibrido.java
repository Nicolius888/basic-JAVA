package com.oop;

public class AutoHibrido extends Auto{

        String motor;

        public AutoHibrido(){};

        public AutoHibrido(String motor){
            this.motor = motor;
        };

        public AutoHibrido(String color, String marca, String modelo, double peso, double largo, String motor){
            super(color, marca, modelo, peso, largo);
            this.motor = motor;
        };

    @Override
    public String toString() {
        return "AutoHibrido{" +
                "motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
