import java.util.Scanner;

/*Crea una función con la siguiente cabecera: 

public String convierteEnMorse(int n) 

Esta función convierte el número n al sistema Morse y lo devuelve en una cadena de caracteres. 
Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse. Utiliza esta función en un 
programa para comprobar que funciona bien. Desde la función no se debe mostrar nada por pantalla, 
solo se debe usar print desde el programa principal. 

0 _ _ _ _ _

1 . _ _ _ _ 

2 . . _ _ _ 

3 . . . _ _ 

4 . . . . _ 

5 . . . . . 

6 _ . . . . 

7 _ _ . . . 

8 _ _ _ . . 

9 _ _ _ _ .  */

public class Morse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para convertirlo en Morse: ");
        int num = teclado.nextInt();
        System.out.print("El número: " + num + " es: " + convierteEnMorse(num) + " en código Morse.");
        teclado.close();
    }
    
    public static String convierteEnMorse(int n) {
        String [] morse = String.valueOf(n).split("");
        String morseFinal = "";
        for (int i = 0; i < morse.length; i++){
            switch (morse[i]){
                case "0": morse[i] = "_ _ _ _ _ "; break;
                case "1": morse[i] = ". _ _ _ _ "; break;
                case "2": morse[i] = ". . _ _ _ "; break;
                case "3": morse[i] = ". . . _ _ "; break;
                case "4": morse[i] = ". . . . _ "; break;
                case "5": morse[i] = ". . . . . "; break;
                case "6": morse[i] = "_ . . . . "; break;
                case "7": morse[i] = "_ _ . . . "; break;
                case "8": morse[i] = "_ _ _ . . "; break;
                case "9": morse[i] = "_ _ _ _ . "; break;
            }
            morseFinal = morseFinal + morse[i] ;
        }
        return morseFinal;
    }
}
