/*Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos.
Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva.
La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra.
Se permite el saldo negativo. */

class CuentaCorriente {
        //Atributos
        private String numeroCuenta = "";
        private double saldo;

        //Constructores
    private CuentaCorriente(){
        this.saldo = 0;
        this.generarNum();
    }

    private CuentaCorriente(double saldo){
        this.saldo = saldo;
        this.generarNum();
    }

        //Getters
    public double getSaldo(){
        return this.saldo;
    }

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

        //Métodos

        private void generarNum(){
            for (int i=0; i < 10; i++){
                numeroCuenta += (int) (Math.random()*10);
            }
        }

        void ingresar(double ingreso){
            this.saldo = this.saldo + ingreso;
        }

        void cargo(double cargo){
            this.saldo = this.saldo - cargo;
        }

        void transferencia(CuentaCorriente cuenta, double transfer){
            this.saldo -= transfer;
            cuenta.saldo += transfer;
        }

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);

        System.out.println("Nº de cuenta: " + cuenta1.getNumeroCuenta() + " Saldo: " + cuenta1.getSaldo());
        System.out.println("Nº de cuenta: " + cuenta2.getNumeroCuenta() + " Saldo: " + cuenta2.getSaldo());
        System.out.println("Nº de cuenta: " + cuenta3.getNumeroCuenta() + " Saldo: " + cuenta3.getSaldo());

        cuenta1.ingresar(2000);
        cuenta2.cargo(600);
        cuenta3.ingresar(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);

        System.out.println("Nº de cuenta: " + cuenta1.getNumeroCuenta() + " Saldo: " + cuenta1.getSaldo());
        System.out.println("Nº de cuenta: " + cuenta2.getNumeroCuenta() + " Saldo: " + cuenta2.getSaldo());
        System.out.println("Nº de cuenta: " + cuenta3.getNumeroCuenta() + " Saldo: " + cuenta3.getSaldo());

    }

    }
