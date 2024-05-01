package edu.edylan.tema.métodos;

public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 99;
    
    public void ligar() {
        estado = true;
    }
    public void desligar() {
        estado = false;
    }

    public void aumentarVolume() {
        if (volume < 100)
            volume++;
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0)
            volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }

    public void passarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
