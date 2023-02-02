/*Escribir un programa en Java que dado un número por teclado, escriba “El número es válido” si: 
 * a. El número se encuentra entre 1000 y 10000
 * b. El número no es divisible por 5 ni termina en 0.
 *  En caso contrario, el texto debe ser “El número NO es válido”.  
 */
import java.util.Scanner;
public class Ejercicio6U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.print("Por favor, introduzca un número entre 1000 y 10000: ");
        numero = teclado.nextInt();
        if (numero>1000 && numero<10000 && numero%10!=0 && numero%5!=0){
            System.out.println("El número es válido");
        } else {
            System.out.println("El número NO es válido");
        }
        teclado.close();
    }
}
