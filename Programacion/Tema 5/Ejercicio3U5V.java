import java.util.Scanner;

/*
 * Crea una aplicación que nos genere una cantidad de números enteros aleatorios 
 * que nosotros le pasaremos por teclado. 
 * 
 * Crea un método donde pasamos como parámetros entre que números queremos que los genere, 
 * podemos pedirlas por teclado antes de generar los números.  Este método devolverá un 
 * número entero aleatorio. 
 * 
 * Muestra los números por pantalla.
 */
public class Ejercicio3U5V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números quiere generar aleatoriamente?");
        int cantidadNumeros = teclado.nextInt();
        System.out.println("¿De qué número a qué numero quiere generarlos?");
        System.out.print("Del: ");
        int numeroMenor = teclado.nextInt();
        System.out.print(" al: ");
        int numeroMayor = teclado.nextInt();
        System.out.println("Los números generados aleatoriamente son: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(aleatorios(numeroMenor, numeroMayor));
        }
        teclado.close();
    }

    public static int aleatorios(int minimo, int maximo) {
        int resultado = (int) Math.floor((Math.random() * maximo - minimo + 1) + minimo);
        return resultado;
    }
}
