import java.util.Scanner;

public class Ejercicio2Punto0 {

    public static void main(String[] args) {

        //Usuario escribe num1
        int usuarioEscribe; //Declaramos Variable

        System.out.print("Por Favor, Introduzca un número entero cualquiera para num1: " );

        Scanner entradaEscaner = new Scanner (System.in); //El usuario escribe el número (puede meter letras pero no se restringir aún)

        usuarioEscribe = entradaEscaner.nextInt (); //Con lo que el usuario ha escrito, se asigna la variable 

        System.out.println("");

        System.out.print("Por Favor, Introduzca un número entero cualquiera para num1: " );
        
        System.out.println ("Perfecto, num1 tomará el valor: " + usuarioEscribe);

        //Usuario escribe num2

        int usuarioEscribe2; //Declaramos Variable

        System.out.print("Por Favor, Introduzca un número entero cualquiera para num2: " );

        Scanner entradaEscaner2 = new Scanner (System.in); //El usuario escribe el número (puede meter letras pero no se restringir aún)

        usuarioEscribe2 = entradaEscaner2.nextInt (); //Con lo que el usuario ha escrito, se asigna la variable 

        System.out.println("");

        System.out.print("Por Favor, Introduzca un número entero cualquiera para num2: " );
        
        System.out.println ("Perfecto, num2 tomará el valor: " + usuarioEscribe2);

        //Operaciones matemáticas para invertir los valores

        int num1=usuarioEscribe;
        int num2=usuarioEscribe2;

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        //Resultado Final

        System.out.println("Gracias a la magia de Java, convierto tu num1 en: " + num1 + " y tu num2 en: " + num2 );


    }
    
}
