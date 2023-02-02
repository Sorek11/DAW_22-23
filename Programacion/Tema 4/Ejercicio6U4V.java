/*
 * Crear una matriz de 5 filas y n columnas (se pide al usuario). 
 * Rellenarlo con números aleatorios entre 0 y 10.
 */
import java.util.Scanner;
public class Ejercicio6U4V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca el tamaño que quiere para las columnas: ");
        int columnasUsuario = teclado.nextInt();
        int [][] matriz = new int[5][columnasUsuario];
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[0].length; j++){
                matriz[i][j]= ((int)Math.floor( (Math.random()*(0-(10+1))+(10+1))));
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        teclado.close();
    }
}
