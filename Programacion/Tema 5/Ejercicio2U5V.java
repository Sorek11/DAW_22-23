import java.util.Scanner;
/*
 * Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. 
 * Pedir por teclado de que figura queremos calcular el área y según lo introducido 
 * pedirá los valores necesarios para calcular el área. Crea un método por cada figura 
 * para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla.
 * 
 * Circulo: (radio^2)*PI
 * 
 * Triangulo: (base * altura) / 2
 * 
 * Cuadrado: lado * lado
 */
public class Ejercicio2U5V {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola, en este programa podrás calcular el área de un circulo, un triangulo o un cuadrado. ");
        System.out.println("¿De qué figura quieres hacer el área?: ");
        String figura = teclado.nextLine(); 
        if (figura.equalsIgnoreCase("circulo")){
            System.out.println("Introduce el radio del circulo: ");
            double radio = teclado.nextDouble();
            System.out.println("El area del circulo, para un radio de : " + radio + " es: " + areaCirculo(radio));
        } else if (figura.equalsIgnoreCase("triangulo")){System.out.println("Introduce la base del triangulo: ");
            double baseTriangulo = teclado.nextDouble();
            System.out.println("Introduce la altura del triangulo: ");
            double alturaTriangulo = teclado.nextDouble();
            System.out.println("El area del triangulo, para un base de : " + baseTriangulo + " y de altura : "+ alturaTriangulo + " es: " + areatriangulo(baseTriangulo, alturaTriangulo));
        } else if (figura.equalsIgnoreCase("cuadrado")){System.out.println("Introduce un lado del cuadrado: ");
            double ladoCuadrado1 = teclado.nextDouble();
            System.out.println("El area del cuadrado, con un lado de : " + ladoCuadrado1 + " es: " + areaCuadrado(ladoCuadrado1));
        } else {
            System.out.println("Figura incorrecta, solo se puede realizar el área del circulo, triángulo o cuadrado.");
        }
        teclado.close();
    }
    public static double areaCirculo (double radio){
        double area = ((radio * radio)*Math.PI);
        return area;
    }
    public static double areatriangulo (double base, double altura){
        double area = (base*altura)/2;
        return area;
    }
    public static double areaCuadrado (double lado1){
        double area = lado1*lado1;
        return area;
    }
}
