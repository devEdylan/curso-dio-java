package edu.edylan.tema.controledefluxo;

import java.util.concurrent.ThreadLocalRandom;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantDoces = 0;
        
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                System.out.println(String.format("Valor Insuficiente. Saldo = %.2f. Valor do Doce: %.2f", mesada, valorDoce));
                break;
            }

            System.out.println(String.format("Doce de valor R$%.2f adicionado ao carrinho.", valorDoce));
            mesada = mesada - valorDoce;
            quantDoces++;
        }
        System.out.println(String.format("Mesada: %.2f", mesada));
        System.out.println("Joãozinho gastou toda sua mesada comprando " + quantDoces + " doces.");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}