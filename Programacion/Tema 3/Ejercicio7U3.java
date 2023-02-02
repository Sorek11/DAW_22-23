/* 7. Escribir un programa en Java que dado por teclado un número, escriba lo siguiente: 
 * a. “A” si su módulo con 5 es 0 
 * b. “B” si su módulo con 5 es 1 
 * c. “C” si su módulo con 5 es 2 
 * d. “D” si su módulo con 5 es 3 
 * e. “E” si su módulo con 5 es 4 
 * f. “F” en otro caso 
 */
import java.util.Scanner;
public class Ejercicio7U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        int numero = teclado.nextInt();
        do {
            if (numero%5==0){
                System.out.println("A");
            } else if (numero%5==1){
                System.out.println("B");
            } else if (numero%5==2){
                System.out.println("C");
            } else if (numero%5==3){
                System.out.println("D");
            } else if (numero%5==4){
                System.out.println("E");
            } else {
                System.out.println("F");
            }
            System.out.print("Si quiere puede introducir otro número (0 para salir) ");
            numero = teclado.nextInt();
        }   while (numero>0);
            teclado.close();
    } 
}

