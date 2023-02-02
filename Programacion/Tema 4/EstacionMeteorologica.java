/*
 * En una estación meteorológica se registra la temperatura (en grados centígrados) en cada hora 
 * durante el día. Almacenamos el resultado en un array de 24 elementos. 
 *
 * Diseña un programa que muestre por pantalla un menú con las siguientes opciones (en negrita) y 
 * que realice las acciones que se describen: 
 *
 * a) Rellenar el vector de forma manual. Esta funcionalidad permite al usuario rellenar manualmente 
 * cada uno de los 24 elementos. 
 *
 * b) Rellenar el vector de forma aleatoria. Los 24 elementos del vector se rellenan de forma aleatoria, 
 * con valores entre 0 y 40. 
 *
 * c) Mostrar datos. Muestra los datos almacenados en el vector.
 *
 * d) Obtener máximos y mínimos. Muestra las temperaturas máxima y mínima del día, así como la hora en la
 * que se dan. 
 *
 * e) Temperatura media. Calcula la temperatura media del día. 
 *
 * f) Salir. Sale del programa.
 */
import java.lang.System;
import java.util.Scanner;
public class EstacionMetereologica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcionMenu = "";
        boolean salir = false;
        double [] datosTemperatura  = new double [24];
        double maximo = 0;
        double minimo = 0;
        int indiceMax= 0;
        int indiceMin=0;
        double suma = 0;
        

        while (salir==false){
            System.out.println("\033[0;1m"+"Bienvenid@ al programa de registro de temperatura de la estación meteorológica.");
            System.out.println("A: Rellenar datos de temperatura manualmente.");
            System.out.println("B: Rellenar datos de temperatura aleatoriamente.");
            System.out.println("C: Mostrar datos de temperatura.");
            System.out.println("D: Obtener máximos y mínimos de temperatura");
            System.out.println("E: Obtener temperatura media.");
            System.out.println("F: Salir");
            System.out.print("Por favor elija una opción: " + "\033[0m");
            opcionMenu=teclado.nextLine();
            System.out.println("");
            
            switch (opcionMenu){
                case "A": 
                    for (int i=0; i<datosTemperatura.length; i++){
                        System.out.print("Por favor, rellene los datos de temperatura de las " + i + " horas : ");
                        datosTemperatura[i]=teclado.nextDouble();
                        teclado.nextLine();
                    }
                    System.out.println("");
                break;
                
                case "B":
                    System.out.println("Los datos de temperatura han sido generados aleatoriamente.\n");
                    for (int j=0; j<datosTemperatura.length; j++){
                        datosTemperatura[j]=((double)Math.round( (Math.random()*41)*10d)/10d);
                    }
                    System.out.println("");
                break;

                case "C":
                    for (int k = 0; k<24; k++ ){
                        System.out.println("La temperatura de las " + k + "h, es: " + datosTemperatura[k] + " grados Celsius.\n");
                    }
                    System.out.println("");
                break;

                case "D":
                    maximo = datosTemperatura[0];
                    minimo = datosTemperatura[0];
                    for (int l=0; l<datosTemperatura.length; l++){
                        if (maximo<datosTemperatura[l]){
                            maximo=datosTemperatura[l];
                            indiceMax = l;
                        }
                        if (minimo>datosTemperatura[l]){
                            minimo=datosTemperatura[l];
                            indiceMin = l;
                        }
                    }
                    System.out.println("El mínimo de temperatura ha sido " + minimo + " grados Celsius, a las " + indiceMin + " horas.");
                    System.out.println("El máximo de temperatura ha sido " + maximo + " grados Celsius, a las "  + indiceMax + " horas.\n"); 
                    System.out.println("");
                break;

                case "E":
                    for (int m=0; m<datosTemperatura.length;m++){
                        suma+=datosTemperatura[m];
                    }
                    System.out.println("La media de temperatura es: " +((double)Math.round((suma/datosTemperatura.length)*10d)/10d)  + " grados.\n");
                    System.out.println("");
                break;

                case "F":
                    System.out.println("Gracias por usar el programa, hasta pronto");
                    salir = true;
                    System.out.println("");
                break;

            }
        }
        teclado.close();
    }
}
