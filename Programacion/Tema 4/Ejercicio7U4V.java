/*
 * Crear dos matrices de n filas x n columnas y sumar sus valores, los resultados se deben 
 * almacenar en otra matriz. Los valores y el tamaño (n), serán insertados por el usuario. 
 * Mostrar las matrices originales y el resultado.
 */
import java.util.Scanner;
public class Ejercicio7U4V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca el valor de las filas de las matrices: ");
        int filasMatriz = teclado.nextInt();
        System.out.println("");
        System.out.print("Por favor, introduzca el valor de las columnas de las matrices: ");
        int columnasMatriz = teclado.nextInt();
        System.out.println("");
        int[][] matriz1 = new int[filasMatriz][columnasMatriz];
        int[][] matriz2 = new int[filasMatriz][columnasMatriz];
        int[][] matrizSuma = new int [filasMatriz][columnasMatriz];

        for (int i=0; i<matriz1.length;i++){
            for (int j=0;j<matriz1[0].length;j++){
                System.out.print("Escribe el valor del índice ["+ i +"] [" + j + "] de la matriz1: ");
                matriz1[i][j]=teclado.nextInt();
                System.out.print("Escribe el valor del índice ["+ i +"] [" + j + "] de la matriz2: ");
                matriz2[i][j]=teclado.nextInt();
                matrizSuma[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        System.out.println("Matriz nº1");
        for (int i=0; i<matriz1.length;i++){
            for (int j=0; j<matriz1[0].length;j++){
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz nº2");
        for (int i=0; i<matriz1.length;i++){
            for (int j=0; j<matriz1[0].length;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Suma de las matrices");
        for (int i=0; i<matriz1.length;i++){
            for (int j=0; j<matriz1[0].length;j++){
                System.out.print(matrizSuma[i][j]+" ");
            }
            System.out.println("");
        }
        teclado.close();
    }
}
