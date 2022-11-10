public class Main {
    public static void main(String[] args) {

        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        int numeroIf = 4;
        var res = "Resultado del if: ";

        if (numeroIf > 0) {
            System.out.println(res + "Es positivo");
        } else if (numeroIf < 0) {
            System.out.println(res + "Es negativo");
        } else if (numeroIf == 0) {
            System.out.println(res + "Es cero");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        //el bloque de código que tendrá el bucle deberá
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //Mostrarlo por pantalla cada vez que se ejecute.
        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("while loop: " + numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While,
        //pero solo se debe ejecutar una vez.
        int numeroDoWhile = 0;

        do{
            numeroDoWhile++;
            System.out.println("DoWhileLoop: " + numeroDoWhile);
        } while (numeroDoWhile < 1);

        //Para el bucle For, crea una variable numeroFor,
        //esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3,
        //se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        for(var numeroFor = 0; numeroFor<=3; numeroFor++){
            System.out.println("For loop: " + numeroFor);
        }

        //Por último, para el Switch, deberás crear la variable estacion,
        //y distintos case para las cuatro estaciones del año.
        //Dependiendo del valor de la variable estacion se deberá mandar un mensaje
        //por consola informando de la estación en la que está.
        //También habrá que poner un default para cuando el valor de la variable no sea una estación.
        var estación = "Otoño";

        switch(estación) {
            case "Otoño":
                System.out.println("Estamos en otoño!");
                break;
            case "Verano":
                System.out.println("Estamos en verano!");
                break;
            case "Primavera":
                System.out.println("Estamos en primavera!");
                break;
            case "Invierno":
                System.out.println("Estamos en invierno!");
                break;
            default:
                System.out.println("Ingrese una estación valida");
        }
    }

}

