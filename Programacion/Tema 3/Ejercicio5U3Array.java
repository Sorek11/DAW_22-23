/*
 * Escribir un programa en Java en el que pida al usuario la inserción de números hasta que inserte un 0. 
 * Una vez terminado, mostrar en orden los números insertados por el usuario.
 */

import java.util.Scanner;
public class Ejercicio5U3Array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenid@, en este programa necesito una cantidad de números que tu elijas para mostrartelos.");
        System.out.println("¿Cuántos números vas a introducir? ");
        int tamañoArray = teclado.nextInt(); //Pedimos al usuario cuántos números va a introducir y esos números serán el tamaño del array
        int [] almacen = new int [tamañoArray]; //definimos el array 
        System.out.print("Por favor, ahora introduzca un número y pulse enter, así hasta " + tamañoArray + " numeros: ");
        
        for (int i=0; i<tamañoArray; i++){
            almacen [i] = teclado.nextInt();
        }

        System.out.print("Los números introducidos son: " );
        for (int i=0; i<tamañoArray; i++){
            System.out.print(almacen[i] + ", ");
        }
        teclado.close();
    }
}