package apple;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public void lerEmail(){
        System.out.println("Lendo email");
    }
    public void escreverEmail() {
        System.out.println("Escrevendo email");
    }

    public void acessarSite() {
        System.out.println("Acessando site");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Pagina...");
    }

    public void verMapa() {
        System.out.println("Mapa aberto");
    }

    public void verAcoes() {
        System.out.println("Mostrando ações");
    }

    public void verClima() {
        System.out.println("Mostrando clima");    
    }
    public void fazerLigacao() {
        System.out.println("Fazendo Ligação");
    }
    public void encerrarLigacao() {
        System.out.println("Encerrando Ligação");
    }
    public void salvarContato() {
        System.out.println("Contato Salvo");
    }
    public void excluirContato() {
        System.out.println("Contato excluído");
    }
    public void ouvirCorreioDeVoz() {
        System.out.println("Ouvindo Correio de Voz");
    }
    public void tirarFoto() {
        System.out.println("Foto tirada");     
    }
    public void verFotos() {
        System.out.println("Abrindo galeria");     
    }
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }
    public void procurarMusica() {
        System.out.println("Procurando musica");
    }
    public void avaliarMusica() {
        System.out.println("Avaliando musica");
    }
    public void assistirMidia() {
        System.out.println("Assistindo musica");
    }
    public void ouvirPodcast() {
        System.out.println("Ouvindo Podcast");        
    }
}
