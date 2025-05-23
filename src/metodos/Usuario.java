package metodos;


public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        // Estado inicial
        smartTv.mostrarEstado();

        // Mudança de volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();


    
        // Mudança de canal
        smartTv.setCanal(13);

        // Estado novo
        smartTv.mostrarEstado();


        // Liga e desliga a TV
        smartTv.ligar();
        System.out.println("ligando a TV...");
        smartTv.mostrarEstado();

        smartTv.desligar();
        System.out.println("Desligando a TV...");
        smartTv.mostrarEstado();
    }
    
}
