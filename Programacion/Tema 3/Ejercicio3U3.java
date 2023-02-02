import java.util.Scanner;
public class Ejercicio3U3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.print("Por favor, ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        if (num1%num2==0){
            System.out.println("La división de sus números es exacta. El resultado es: " + (num1/num2));
        } else {
            System.out.print("La división de sus números no es exacta, el resultado es: " + (num1/num2) + " con un resto de: " + (num1%num2));
        }
        teclado.close();
    }
}
