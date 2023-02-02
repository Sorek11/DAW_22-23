/* 2. Escribir por pantalla los números incrementando desde 1 hasta que la suma de todos esos números sea mayor a una variable entera x. Ejemplos:
 * X = 10; 1, 2, 3, 4, 5 -> 1+2+3+4+5 = 15 
 * X = 25; 1, 2, 3, 4, 5, 6, 7 -> 1+2+3+4+5+6+7 = 28
 */
import java.util.Scanner;
public class Ejercicio2U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int x = teclado.nextInt();
        int k=1;
        int a=0;
        while (a < x){
            System.out.println(k);
            int b=k++;
            a=(((1+b)/2)*b);   
        } 
        teclado.close();
    }   
}