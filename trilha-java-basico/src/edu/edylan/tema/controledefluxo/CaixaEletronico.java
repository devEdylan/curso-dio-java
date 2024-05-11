package edu.edylan.tema.controledefluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado <= saldo)
            saldo = saldo - valorSolicitado;
        else
            System.out.println("Você não possui saldo suficiente.");
        
        System.out.println(saldo);
    }
    
}
