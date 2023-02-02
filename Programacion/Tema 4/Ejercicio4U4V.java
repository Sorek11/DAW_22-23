/*Pedir al usuario por teclado una frase y pasar sus caracteres a un array de caracteres. */
import java.util.Scanner;
public class Ejercicio4U4V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce una frase: ");
        String palabras=teclado.nextLine();
        char[] arrayCaracteres=new char[palabras.length()];
        for (int i=0; i<arrayCaracteres.length; i++){
            arrayCaracteres[i]=palabras.charAt(i);
            System.out.println("["+i+"]: " + arrayCaracteres[i]);
        }
    teclado.close();
    }
}
