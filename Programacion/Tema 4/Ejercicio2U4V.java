/*Crea un array de números donde le indicamos por teclado el tamaño del array, 
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por 
pantalla el valor de cada posición y la suma de todos los valores. */

import java.util.Scanner;
public class Ejercicio2U4V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamañoArray=0;
        int suma=0;
        System.out.print("Cuál será el tamaño del array?: ");
        tamañoArray=teclado.nextInt();
        int [] numeros = new int [tamañoArray];
        for (int i=0; i<numeros.length;i++){
            numeros[i]=(int)Math.floor(Math.random()*10);
        }
        for (int i=0; i<numeros.length; i++){
            suma=suma+numeros[i+1];
        }
        
        for (int i=0; i<numeros.length; i++){
            System.out.println("El valor de la posición "+i+" es: " + numeros[i]);
        }
        System.out.println("La suma total del array es: "+suma);
        teclado.close();
    }
}
