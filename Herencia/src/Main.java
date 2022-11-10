public class Main {
    public static void main(String[] args) {
        Cliente Fernandez = new Cliente();
        Fernandez.credito = 10;
        Fernandez.nombre = "Jose";
        Fernandez.edad = 40;
        Fernandez.telefono = 1133244335;
        System.out.println(Fernandez.nombre);
        System.out.println(Fernandez.edad);
        System.out.println(Fernandez.telefono);
        System.out.println(Fernandez.credito);

        Trabajador Perez = new Trabajador();
        Perez.nombre = "Jose";
        Perez.edad = 32;
        Perez.telefono = 02320343343;
        Perez.salario = 30000;
        System.out.println(Perez.nombre);
        System.out.println(Perez.edad);
        System.out.println(Perez.telefono);
        System.out.println(Perez.salario);

        //no funcionaria asignarle un salario a Perez, es trabajador pero no cliente.
        //como tampoco asignarle un credito a Fernandez, es cliente y no trabajador
    }
}
class Persona{
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.