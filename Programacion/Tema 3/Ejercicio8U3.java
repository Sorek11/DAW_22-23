//Escribir un programa en Java que calcule si un determinado número que se pasa por teclado es primo. 
import java.util.Scanner;
public class Ejercicio8U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        System.out.print("Introduzca un número para saber si es primo: ");
        int numero=teclado.nextInt();
        int acumulador=0; //Esta variable servirá para acumular 1 cada vez que la división entre el número e i dé resultado exacto
        for (int i=1; numero>=i; i++){ //Hará el bucle hasta que el divisor(i) supere el dividendo(numero) e irá sumando 1 a i hasta que eso ocurra.
            if (numero%i==0){ 
              acumulador++; //Si el módulo del número es igual a 0 entonces acumula 1 
            } 
        } 
        if (acumulador==2){ //Como un número primo solo puede ser dividido por él mismo y por 1, para que sea primo solo tiene que tener 2 acumuladores máximo.
          System.out.println("El número introducido" + ANSI_GREEN +" es primo."  + ANSI_RESET);
        } else {
          System.out.println("El número introducido " + ANSI_RED + "NO es primo." + ANSI_RESET);
        }  
        teclado.close();
    }
}
