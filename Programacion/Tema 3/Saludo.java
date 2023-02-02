import java.util.Scanner;

public class Saludo {

    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Inserte aquí una hora del día (número entero): ");

        int hora = teclado.nextInt();

        if ((hora >= 0) && (hora < 7)) { 

            System.out.println("Buenas noches.");
        }

        else if ((hora >= 7) && (hora < 14)){
            System.out.println("Buenos días.");
        }

        else if ((hora >= 14) && (hora < 21)){
            System.out.println("Buenas tardes.");
        }

        else if ((hora >= 21) && (hora < 0)){
            System.out.println("Buenas noches");
        }

        else {
            System.out.println("No ha introducido una hora correcta");
        }
        teclado.close();
    }

}