/*La empresa El Corte Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo. Como primer paso para implementar la aplicación, es necesario crear la clase principal. Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo. */

package CorteIslandes;

public class TarjetaRegalo {
    int numeroTarjeta;
    double saldo;

    //Constructor
    private TarjetaRegalo (double saldo){
        this.numeroTarjeta = (int) Math.floor(Math.random() * (99999 - 10000 + 1) + 10000);
        this.saldo = saldo;
    }

    //Getters
    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numeroTarjeta;
    }

    //Métodos
    public void consulta(){
        System.out.println("Tarjeta nº " + getNumero() + " - Saldo: " + getSaldo() + " euros");
        System.out.println();
    }

    public void gastar(double a){
        if (a > this.saldo){
            System.out.println("No tiene suficiente saldo para gastar " + a + " euros");
            System.out.println();
        } else {
            System.out.println("Tarjeta nº " + getNumero() + " - Saldo: " + (saldo -= a) + " euros");
            System.out.println();
        }
    }

    public TarjetaRegalo fusionTarjeta(TarjetaRegalo a){
        TarjetaRegalo t3 = new TarjetaRegalo(getSaldo() + a.getSaldo());
        this.saldo = 0;
        a.saldo = 0;
        return t3;
    }
    

    public static void main(String[] args) {
    
    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);

        t1.consulta();
        t2.consulta();
        t1.gastar(45.90);
        t2.gastar(5);
        t2.gastar(200);
        t1.gastar(3.55);

    TarjetaRegalo t3 = t1.fusionTarjeta(t2);

        t1.consulta();
        t2.consulta();
        t3.consulta();
        t3.gastar(150.55);
    
    }
}
