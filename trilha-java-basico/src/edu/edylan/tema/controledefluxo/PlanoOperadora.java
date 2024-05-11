package edu.edylan.tema.controledefluxo;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T";
        System.out.println("Benefícios:\n");
        switch (plano) { // A Organização das condições é feita para que não seja preciso repetir os benefícios de cada plano, o plano Turbo possui o seu proprio beneficio assim com os beneficios do plano Midia e Basic, então nessa organização, usando o Turbo, entraria também nas condições do plano Midia e Basic mostrando seus benefícios também.
            case "T":
                System.out.println("5 GB de YouTube");
            case "M":
                System.out.println("WhatsApp e Instagram gratis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
