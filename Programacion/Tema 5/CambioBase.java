import java.util.Scanner;

/*
 * Crea un programa en Java que convierta un número en base decimal a binario. 
 * Esto lo realizará un método al que le pasaremos el numero entero como parámetro y 
 * devolverá un String con el numero convertido a binario. 
 * 
 * Os recuerdo como convertir un número decimal a binario: dividir entre 2 el numero, 
 * el resultado de esa división se divide entre 2 de nuevo y así sucesivamente hasta 
 * que no se pueda dividir mas, el resto que obtengamos de cada división formara el numero 
 * binario, de abajo a arriba.
 */

public class CambioBase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número en base decimal");
        int baseDecimal = teclado.nextInt();
        System.out.println("El número " + baseDecimal + " en binario es: " + binario(baseDecimal));
        if (baseDecimal==0){
            System.out.println("El número " + baseDecimal + " en binario es: 0");
        }
        teclado.close();
        
    }

    public static String binario (int a){
        String cadenaBinaria= "";
        while (a!=0){
            int b= a%2;
            cadenaBinaria = Integer.toString(b) + cadenaBinaria;
            a=a/2;
        }
        return cadenaBinaria;
    }
    
}
