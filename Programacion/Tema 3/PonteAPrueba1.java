import java.util.*; //Importación de libreria de java util, está con * para que cargue entera, si no sería java.util.Scanner

public class PonteAPrueba1 {
    
   
    public static void main (String[] args){

        //Definimos la variable teclado con lo que se recoja del teclado
        Scanner teclado = new Scanner(System.in);

        //Apartado de alumnos en clase
        System.out.print("¿Cuántos alumnos sois en clase?");
       
        int clase=teclado.nextInt();

        System.out.println("En clase somos " + clase + " alumn@s");


        //Apartado de nombre y apellidos completos
        System.out.print("¿Cuál es tu nombre?");

        String nombre=teclado.next() ;

        System.out.print("¿y tu apellido?");

        String apellido=teclado.next() ;

        System.out.println("Mi nombre completo es " + nombre + " " + apellido);


        //Apartado de nota media de la ESO
        System.out.print("¿Cuál fue tu nota media en la ESO?");
        
        double nota=teclado.nextDouble();
        
        System.out.println("Mi nota media de la ESO fue: " + nota);
        teclado.close();
    }

}
