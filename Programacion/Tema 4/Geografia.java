/*
 * Crea un programa que pida por pantalla cuatro provincias españolas y a continuación tres ciudades 
 * de cada una de ellas. Los nombres de ciudades deben almacenarse en un array multidimensional cuyo 
 * primer índice sea el número asignado a cada provincia y el segundo índice el número asignado a cada ciudad.
 *
 * Ejemplo de resultados que debe mostrar el programa:
 *
 * Provincia: Asturias Ciudades: Gijón Oviedo Avilés
 *
 * Provincia: Madrid Ciudades: Madrid Tres Cantos Getafe
 * 
 * Provincia Galicia Ciudades: A Coruña Lugo Ourense
 *
 *Provincia: Murcia Ciudades: Lorca Cartagena Murcia
 */
import java.util.Scanner;
public class Geografia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [][] arrayGeografia = new String [4][4];
        int filas = arrayGeografia.length;
        int columnas = arrayGeografia[0].length;
        
        for (int i=0;i<filas;i++){
            for (int j=0; j<1; j++){
                System.out.print("Por favor, introduce el nombre de una Provincia: ");
                arrayGeografia[i][0]=teclado.nextLine();
            }
        }
        for (int i=0;i<filas;i++){
            for (int j=1; j<columnas; j++){
                System.out.print("Por favor, introduce una ciudad de la provincia de " +arrayGeografia[i][0] + ": ");
                arrayGeografia[i][j]=teclado.nextLine();
            }
        }

        for (int i=0;i<filas;i++){
            System.out.print("Provincia: ");
            for (int j=0; j<1; j++){
                System.out.print(arrayGeografia[i][j] + " "); 
            }
            System.out.print("Ciudades: ");
            for (int j=1; j<columnas; j++){
                System.out.print(arrayGeografia[i][j] + " "); 
            }
            System.out.print("\n");
        }
       teclado.close();
    }
}
