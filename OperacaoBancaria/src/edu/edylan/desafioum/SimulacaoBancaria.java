package edu.edylan.desafioum;
import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {
  static float saldo = 0;
  static Scanner scanner = new Scanner(System.in);//.useLocale(Locale.US); 
    public static void main(String[] args) {
        boolean continuar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (continuar) {
          System.out.println("\nBem-vindo a sua conta bancária!");
          System.out.println("Escolha uma opção abaixo: ");
          System.out.println("1. Depositar");
          System.out.println("2. Sacar");
          System.out.println("3. Consultar Saldo");
          System.out.println("0. Encerrar");
          System.out.print("Opção Desejada: ");
          int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
          switch (opcao){
            case (1):
              System.out.print("Digite o valor do depósito: R$");
              float deposito = scanner.nextFloat();
              depositar(deposito);
              break;
            case (2):
              System.out.print("Digite o valor de saque: R$");
              float saque = scanner.nextFloat();
              if (saque > saldo) {
                System.out.println("Saldo insuficiente.");
              } else {
                sacar(saque);
              }
              break;
            case (3):
              consultarSaldo();
              break;
            case (0):
              System.out.println("Programa encerrado.");
              continuar = false;
              break;
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
            }
        }
    }
    static void depositar(float valorDesejado) {
      saldo += valorDesejado;
      System.out.printf("Saldo atual: %.2f\n", saldo);
    }
    
    static void sacar(float valorDesejado) {
      saldo -= valorDesejado;
      System.out.printf("Você sacou %.2f\n", valorDesejado);
      System.out.printf("Saldo atual: %.2f\n", saldo);
    }
    
    static void consultarSaldo() {
      System.out.printf("Saldo atual: %.2f\n", saldo);
    }
}