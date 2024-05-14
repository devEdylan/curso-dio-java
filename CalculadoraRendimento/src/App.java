import java.util.Scanner;
import java.lang.Math;

public class App {
    static double taxa = 0;
    static Scanner scan = new Scanner(System.in);
    static double porcentagem = 0;
    static int tempo = 0;
    public static void main(String[] args) throws Exception {
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Calculadora de Rendimentos - CDB");
            System.out.println("1 - Calcular CDI");
            System.out.println("2 - Calcular rendimento");
            System.out.println("3 - Calcular tempo até montante desejado");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    calcularTaxa();
                    System.out.println(String.format("Taxa CDI: %.2f", taxa * 100) + "% a.a.\n");
                    break;
                case 2:
                    System.out.print("Insira abaixo seu capital inicial: ");
                    double capitalInicial = scan.nextDouble();
                    conferirTaxa();
                    double montante = calcularRendimento(capitalInicial);
                    double imposto = tratarImpostos(tempo, capitalInicial, montante);
                    System.out.println(String.format("rendendo a %.2f", porcentagem) + "%" + String.format(", ao final de %d meses, obtém-se %.2f, e subtraindo o imposto de renda de %.2f, obtém-se %.2f", tempo, montante, imposto, montante - imposto));
                    break;
                case 3:
                    System.out.print("Insira abaixo seu capital inicial: ");
                    capitalInicial = scan.nextDouble();
                    System.out.print("Insira abaixo seu montante desejado: ");
                    double montanteAtual = scan.nextDouble();
                    conferirTaxa();
                    double tempo = calcularTempo(capitalInicial, montanteAtual);
                    System.out.println("O tempo necessário para atingir o montante desejado é " + String.format("%.2f", tempo) + " mes(es).");
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }

    static void calcularTaxa(){
        System.out.print("Insira abaixo seu capital inicial: ");
        double capitalInicial = scan.nextDouble();
        System.out.print("Insira abaixo seu montante atual: ");
        double montanteAtual = scan.nextDouble();
        System.out.print("Insira o tempo em meses que o capital inicial investido permaneceu inalterado: ");
        tempo = scan.nextInt();
        System.out.print("Insira quantos porcento da taxa (não insira o símbolo de porcentagem), o investimento rende: ");
        porcentagem = scan.nextDouble();
        taxa = (double) (((Math.pow(Math.pow((montanteAtual / capitalInicial), 12), (1/tempo)) - 1) * 100) / porcentagem);
    }

    static double calcularRendimento(double capitalInicial){
        System.out.print("Insira o tempo em meses que o capital inicial investido permanecerá inalterado: ");
        tempo = scan.nextInt();
        System.out.print("Utilizando uma taxa de " + String.format("%.2f",taxa * 100) + "% a.a ");
        double montante = capitalInicial * Math.pow((1 + taxa), ((double)(tempo)/12));
        return montante;
    }

    static double tratarImpostos(int tempo, double capitalInicial, double montanteAtual){
        double juros = montanteAtual - capitalInicial;
        double impostoRenda = 0;
        tempo *= 30;
        // IMPOSTO DE RENDA
        if (tempo < 180)
            impostoRenda = 22.5F / 100;
        else if (tempo >= 180)
            impostoRenda = 20F / 100;
        else if (tempo >= 361 && tempo < 720)
            impostoRenda = 17.5F / 100;
        else 
            impostoRenda = 15F / 100;
        return juros * impostoRenda;
    }

    static double calcularTempo(double capitalInicial, double montanteAtual){
        double relacaoJuros = Math.pow(montanteAtual / capitalInicial, 12);
        return (Math.log10((relacaoJuros)) / Math.log10(1 + taxa));
    }
    static void conferirTaxa(){
        if (taxa == 0) {
            System.out.print("Insira a taxa de juros a qual o investimento rende (em valor de porcentagem mas sem o símbolo): ");
            taxa = scan.nextDouble() / 100;
        } else {
            System.out.println("Deseja utilizar a taxa calculada ou inserir uma nova? 1 - Nova Taxa; 2 - Taxa Calculada");
            int segundaOpcao = scan.nextInt();
            if (segundaOpcao == 1){
                taxa = scan.nextDouble() / 100;
            }
        }
        System.out.print("Insira quantos porcento da taxa (não insira o símbolo de porcentagem), o investimento rende: ");
        porcentagem = scan.nextDouble();
        taxa *= (porcentagem / 100);
    }
}
