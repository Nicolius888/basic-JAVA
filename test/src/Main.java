public class Main {

    public static void main(String[] args) {
        int result = suma(10,20,30);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.cantPuertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

     static class Coche {
        public int cantPuertas = 4;
        public void incrementarPuertas(){
            this.cantPuertas++;
        }
    }
}