class Bombilla {
    //Atributos
    String estado;

    //Constructor

    //Si se le mete un String coge el estado de ese String.
    public Bombilla(String estado){
        this.estado = estado;
        
    }

    //Por defecto apagada.
    public Bombilla(){
        this.estado = "Apagada";
    }

    //Métodos
    public void encender(){
        estado = "Encendida";
    }

    public void apagar(){
        estado = "Apagada";
    }

   

    public static void main(String[] args) {
        Bombilla bombilla1 = new Bombilla();
            System.out.println(bombilla1.estado);
            bombilla1.encender();
            System.out.println(bombilla1.estado);
        Bombilla bombilla2 = new Bombilla("Encendida");
        System.out.println(bombilla2.estado);

        System.out.println(bombilla1.estado.equals(bombilla2.estado));
    }
}
