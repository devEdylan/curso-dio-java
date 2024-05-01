package edu.edylan.tema.métodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.estado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("A Tv está ligada? " + smartTv.estado);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo Volume Atual: " + smartTv.volume);

        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        System.out.println("Novo Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo Canal Atual: " + smartTv.canal);

    }
}
