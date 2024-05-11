import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numeroUm = scn.nextInt();

        System.out.println("Insira um outro número inteiro maior que o primeiro: ");
        int numeroDois = scn.nextInt();

        try {
            contar(numeroUm, numeroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        } finally {
            scn.close();
        }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo o número %d\n", i);
        }
    }
}

class ParametrosInvalidosException extends Exception {}