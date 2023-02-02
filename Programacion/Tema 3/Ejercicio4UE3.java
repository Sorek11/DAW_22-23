import java.util.Scanner;
public class Ejercicio4UE3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        double numero = teclado.nextDouble();

        while (numero!=0){
            while (numero%1==0){
                if (numero%2==0){
                    System.out.print("El número introducido es par");
                } else {
                    System.out.print("El número introducido es impar");
                }
                if (numero>=0){
                    System.out.print(", positivo y ");
                } else {
                    System.out.print(",  negativo y ");
                }
                if (numero%1==0){
                    System.out.println(" entero.");
                    System.out.println("");
                }
                 break;
            } 
            while (numero%1!=0){
                if (numero>=0){
                    System.out.print("El número introducido es positivo y ");
                } else {
                    System.out.print("El número introducido es negativo y ");
                }if (numero%1!=0){
                    System.out.println(" decimal.");
                    System.out.println("");
                }
                 break;
            } 
            System.out.print("Por favor, introduzca otro número (0 para finalizar): ");
            numero = teclado.nextDouble();
        }
        System.out.println("Gracias por utilizar el programa, adiós.");
        teclado.close();
    }
}
