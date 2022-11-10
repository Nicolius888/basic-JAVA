package com.oop;

public class AutoElectrico extends Auto{

    //atributo nuevo (ademas de los heredados)
    String motorElectrico;

    //constructor nuevo
    public AutoElectrico(){};

    //constructor con mi atributo exclusivo de esta clase
    public AutoElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    //constructor con atributos del SUPER, i.e. traer todos los atributos de la clase padre
    //para poder usarlos directamente cuando hagamos new AutoElectrico()
    //esto tambien es por medio de Sobrecarga del constructor:
    public AutoElectrico(String colorete, String marca, String modelo, double peso, double largo, String motorElectrico){
        super(colorete, marca, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override                                   //sobreescribimos el metodo original
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;//hacemos algo antes de la funcion original, y le pasamos el parametro ajustado
        super.acelerar(cantidadAjustada);               //aca accedemos al metodo original y "aceleramos", con otro parametro.
    }

    @Override //left click + generate + select all with ctrl + enter
    public String toString() {
        return "AutoElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
