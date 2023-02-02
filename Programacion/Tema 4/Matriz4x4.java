import java.util.Scanner;
public class Matriz4x4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            int [][] matriz = new int[4][4];
            int filas= matriz.length;
            int columnas = matriz[0].length;
            boolean salir=false;
            String opcionCaseA = "";


            while (salir==false){ 
                System.out.println("");
                System.out.println("MENÚ DE OPCIONES");
                System.out.println("----------------");
                System.out.println("A. Rellenar Matriz");
                System.out.println("B. Sumar una fila");
                System.out.println("C. Sumar una columna");
                System.out.println("D. Sumar diagonal principal");
                System.out.println("E. Sumar diagonal inversa");
                System.out.println("F. Media de los valores de la matriz");
                System.out.print("Elijo la opción: ");
                String opcionMenu = teclado.nextLine();
                System.out.println("");
                switch (opcionMenu){
                    case "A":
                        for (int i=0; i<filas; i++){
                            for (int j=0; j<columnas; j++){
                                System.out.print("Introduce el número de la posición [" + i + "] [" + j + "]: ");
                                matriz[i][j]=teclado.nextInt();
                            }
                        }
                        while (!(opcionCaseA.equalsIgnoreCase("G"))){
                            System.out.println("");
                            System.out.println("¿QUÉ DESEA HACER AHORA?");
                            System.out.println("");
                            System.out.println("A. Rellenar de nuevo los valores de la matriz");
                            System.out.println("B. Sumar una fila");
                            System.out.println("C. Sumar una columna");
                            System.out.println("D. Sumar diagonal principal");
                            System.out.println("E. Sumar diagonal inversa");
                            System.out.println("F. Media de los valores de la matriz");
                            System.out.println("G. Salir del programa");
                            System.out.print("Elijo la opción: ");
                            opcionCaseA = teclado.next();
                            System.out.println("");
                            switch (opcionCaseA){ 
                                case "A": //RELLENAR MATRIZ DE NUEVO
                                    for (int i=0; i<filas; i++){
                                        for (int j=0; j<columnas; j++){
                                            System.out.print("Introduce el número de la posición [" + i + "] [" + j + "]: ");
                                            matriz[i][j]=teclado.nextInt();
                                        }
                                    }
                                break;

                                case "B": //SUMA DE UNA FILA DE LA MATRIZ
                                    int opcionB=0; // Variable para la opción A
                                    int sumaB = 0; //declaro e inicio variable aquí para que cada vez que seleccione A la variable empiece valiendo 0.
                                    System.out.print("Qué fila quieres sumar?: ");
                                    opcionB = teclado.nextInt();
                                    System.out.println("");
                                    while (opcionB>=4){
                                        System.out.print("Fila incorrecta, por favor seleccione una fila entre 0 y 3: \n");
                                        opcionB = teclado.nextInt();
                                        System.out.println("");
                                    }
                                    for (int i=opcionB; i==opcionB; i++){
                                        for (int j=0; j<columnas;j++){
                                            sumaB = sumaB+matriz[i][j];
                                        }
                                    }
                                    System.out.println("La suma de los números de la fila "+ opcionB + " es: "+ sumaB);
                                    System.out.println("");
                                break;
                                    
                                case "C": //SUMA DE UNA COLUMNA DE LA MATRIZ
                                    int opcionC=0;
                                    int sumaC = 0;
                                    System.out.print("Qué columna quieres sumar?: ");
                                    opcionC = teclado.nextInt();
                                    System.out.println("");
                                    while (opcionC>=4){
                                        System.out.print("Columna incorrecta, por favor seleccione una columna entre 0 y 3: \n");
                                        opcionC = teclado.nextInt();
                                        System.out.println("");
                                    }
                                    for (int i=0; i<filas; i++){
                                        for (int j=opcionC; j==opcionC;j++){
                                            sumaC = sumaC+matriz[i][j];
                                        }
                                    }
                                    System.out.println("La suma de los números de la columna "+ opcionC + " es: "+ sumaC);
                                    System.out.println("");
                                break;

                                case "D": //SUMA DE LA DIAGONAL PRINCIPAL DE LA MATRIZ
                                    int sumaD=0;
                                    for (int i=0; i<filas; i++){
                                        for (int j=0; j<columnas; j++){
                                            if (i==j){
                                                sumaD = sumaD+matriz[i][j]; 
                                            }
                                            
                                        }
                                    }
                                    System.out.println("La suma de la diagonal principal es: " + sumaD );
                                break;

                                case "E": //SUMA DE LA DIAGONAL INVERSA DE LA MATRIZ
                                    int sumaE = 0;
                                    for (int i=0; i<filas; i++){
                                        for (int j=0; j<columnas; j++){
                                            if (i==((columnas-1)-j)){ //(columnas-1), porque el tamaño es 4 y j llega solo hasta 3
                                                sumaE = sumaE+matriz[i][j]; 
                                            }
                                            
                                        }
                                    }
                                    System.out.println("La suma de la diagonal inversa es: " + sumaE );
                                break;

                                case "F": //MEDIA DE LA MATRIZ
                                    int sumaF=0;
                                    for(int i=0;i<filas;i++){
                                        for (int j=0; j<columnas; j++){
                                            sumaF=sumaF+matriz[i][j];
                                        }
                                    }
                                    System.out.println("La media de la matriz es : " + (sumaF/(filas*columnas)));
                                break;
                            }
                        }
                        salir = true;
                    break;
                    default: 
                        System.out.println("La opción no es válida, primero tiene que rellenar la matriz. ");
                }
        }
        teclado.close();
        System.out.println("Gracias, hasta pronto.");
    }
}
