package edu.edylan.tema.controledefluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 3;
        /** Estrutura Encadeada
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");
        else
            System.out.println("Reprovado");*/
        // Estrutura Ternária
        String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Prova de Recuperação" : "Reprovado");
        System.out.printf("Nota: %d\nResultado: %s", nota, resultado);
    }
    
}
