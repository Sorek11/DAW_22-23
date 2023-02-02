/*Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
Obtén la suma de todos ellos y la media. */
public class Ejercicio3U4V {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int suma=0;
        for (int i=0; i<numeros.length; i++){
            numeros[i]=i+1; //i+1 porque i empieza en el 0
        }
        for (int i=0; i<numeros.length; i++){
            suma=suma+numeros[i];
        }
        System.out.println("La Suma del Array es: " + suma);
        System.out.println("La media del Array es: " + (suma/numeros.length));
    }
}
