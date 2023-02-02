//1. Crea un array de 10 posiciones de números con valores 
//pedidos por teclado. Muestra por consola el indice y el valor al que corresponde.
import java.util.Scanner;
public class Ejercicio1U4V {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int[] numeros=new int [10];
        for (int i=0; i<numeros.length;i++){
            System.out.println("Por favor, introduce el número de la posición " + i);
            numeros [i] = teclado.nextInt();
        }
        for (int i=0; i<numeros.length; i++){
            System.out.println("Número posición [" + i + "]: " + numeros [i]);
        }
        teclado.close();
    }
}
