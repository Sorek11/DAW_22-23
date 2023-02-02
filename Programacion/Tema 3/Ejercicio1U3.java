// 1. Escribir por pantalla los números del 1 al 100 que sean impares.

/**
 * DAW - Programación 2022
 * @author: Programa creado por Víctor García
 * @version: 1.0
 */

import java.util.Scanner;
public class Ejercicio1U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe qué tipos de números deseas ver ¿par o impar?: ");
        String eleccion = teclado.next();
        int i = 1;
        if (eleccion.equalsIgnoreCase("par")) { //Para String no funciona el == tiene que ser con variable.equals("...") y el equalsIgnoreCaps es para no discriminar mayus
            while (i<=100){
                i++;
                System.out.println(i);
                i++;
            }
        } else if (eleccion.equalsIgnoreCase("impar")) {
            while (i<=100){
                System.out.println(i);
                i=i+2;
            }
        } else {
            System.out.println("Término incorrecto, reinicie el programa");
        } 
        teclado.close();
    }
}
