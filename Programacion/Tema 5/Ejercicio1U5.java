import java.util.Scanner;

/*
 * Escribir una función que realice la potencia de 2 números dados por el usuario, 
 * siendo uno la base y otro el exponente. Utilizar esta función para mostrar los 
 * cuadrados de los números del 1 al 10. 
 */
public class Ejercicio1U5V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor para la base de la potencia: ");
        int basePotencia = teclado.nextInt();
        System.out.println("Introduce un valor para el exponente de la potencia: ");
        int exponentePotencia = teclado.nextInt();
        System.out.println("El resultado de " + basePotencia + "^" + exponentePotencia + " es: " + funcionPotencia(basePotencia, exponentePotencia));
        for (int i = 1; i<=10 ; i++){
            System.out.println("El cuadrado de " + i + " es: " + funcionPotencia(i, 2));
        }
        teclado.close();
    }

    public static int funcionPotencia (int a, int b){
        int totalPotencia = 1;
        if (a == 0){
            System.out.println("La base no es válida, no se puede realizar una potencia con base 0");
        } else {
            for (int i = 0; i < b ; i++){
                totalPotencia = totalPotencia * a;
            }
        } return totalPotencia;
    }


}
