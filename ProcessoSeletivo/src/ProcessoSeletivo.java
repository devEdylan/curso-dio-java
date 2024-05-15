import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static String [] candidatos = {"MARCIA", "FELIPE", "RUAN", "MARCELO", "JOSE", "JERONIMO", "ROBERTO", "RODRIGO", "ISAIAS", "MARCOS", "MAURÍCIO"};
    static double salarioBase = 2000.0;

    public static void main(String[] args) throws Exception {
        ArrayList<String> candidatosValidos = selecaoCandidatos();
        imprimirCandidatos(candidatosValidos);
        for (String candidato : candidatosValidos){
            entrandoEmContato(candidato);
        }
    }

    static void imprimirCandidatos(ArrayList<String> candidatosValidos){
        System.out.println("\nImprimindo a lista de candidatos selecionados informando o índice do elemento");
        for (String candidato : candidatosValidos){
            if (candidato == null){
                break;
            }
            System.out.println(String.format("O candidato %s foi selecionado", candidato));
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            tentativasRealizadas++;
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu == true){
            System.out.println(String.format("Foi possível entrar em contato com o candidato %s após %d tentativas",candidato, tentativasRealizadas));
        } else {
            System.out.println(String.format("Após 3 tentativas, não foi possível entrar em contato com o candidato %s", candidato));
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static ArrayList<String> selecaoCandidatos() {
        ArrayList<String> candidatosValidos = new ArrayList<String>();

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println(String.format("\nO candidato %s solicitou R$%.2f como salario", candidato, salarioPretendido));
            if (salarioBase >= salarioPretendido){
                candidatosValidos.add(candidato);
                candidatosSelecionados++;
                System.out.println(String.format("O candidato %s foi selecionado para a vaga", candidato));
            }
            candidatoAtual++;
        }
        return candidatosValidos;
    }

    static void analisarCandidato(double salarioPretendido) {
        
        if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO");
        else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
