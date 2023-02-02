import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce un número para conocer sus dígitos: ");
        int numero = teclado.nextInt();
        System.out.println("El número " + numero + " tiene " + cuentaDigitos(numero) + " dígitos.");
        teclado.close();
    }

    //1234
    //  1 + cuentaDigitos(1234/10) = 1 + (1 + 1 + 1 + 0) = 4
    //      1 + cuentaDigitos(123/10) = 1 + (1 + 1 + 0)
    //          1 + cuentaDigitos(12/10) = 1 + (1 + 0)
    //              1 + cuentaDigitos(2/10) = 1 + (0)
    //                  0

    public static int cuentaDigitos (int a){
        int contador = 0;
        if (a==0){
            return 0;
        } else {
            contador = 1 + cuentaDigitos(a/10);
            return contador;
        }
    }
}
