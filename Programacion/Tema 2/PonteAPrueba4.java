public class PonteAPrueba4 {
    
    public static void main (String[] args){

        final double numeroAleatorio = Math.random();

        int numeroInt = (int) numeroAleatorio;
        short numeroCorto = (short) numeroAleatorio;
        long numeroLargo = (long) numeroAleatorio;
        byte numeroByte = (byte) numeroAleatorio;

        System.out.println(numeroInt);
        System.out.println(numeroCorto);
        System.out.println(numeroLargo);
        System.out.println(numeroByte);
    }
}
