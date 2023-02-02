/*
 * Escribir un programa en Java en el que pida al usuario la inserción de números hasta que inserte un 0. 
 * Una vez terminado, mostrar en orden los números insertados por el usuario.
 */
import java.util.Scanner;
public class Ejercicio5U3 {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long numero = 1;
        String numToString = "";
        String numToString2 = "";
        while (numero != 0){
            System.out.print("Por favor, ingrese un numero (pulse 0 para salir): ");
            numero= teclado.nextInt();
            numToString = numToString2 + String.valueOf(numero) ;
            numToString2 = numToString;
        } 
        long numFinal = Long.parseLong(numToString);
        System.out.print("Los números que han sido introducidos son: " + (numFinal/10));
        teclado.close();
   }    
}