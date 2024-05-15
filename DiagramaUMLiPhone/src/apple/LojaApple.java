package apple;

public class LojaApple {
    public static void main(String[] args) {
        AparelhoTelefonico telefone = new Iphone();
        ReprodutorMusical ipod = new Iphone();
        NavegadorInternet safari = new Iphone();

        telefone.fazerLigacao();
        ipod.tocarMusica();
        safari.verClima();
        safari.acessarSite();

    }
}
