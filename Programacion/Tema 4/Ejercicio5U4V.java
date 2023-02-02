/*Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla en forma de matriz. */
public class Ejercicio5U4V {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int numero = 0;
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                numero++;
                matriz[i][j]=numero; 
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
