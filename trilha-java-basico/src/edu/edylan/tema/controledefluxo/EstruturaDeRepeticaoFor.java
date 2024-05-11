package edu.edylan.tema.controledefluxo;

public class EstruturaDeRepeticaoFor {
    public static void main(String[] args) {
        int[] anArray = new int[10];;

        for (int i = 0; i < anArray.length; i++){
            anArray[i] = 100 * (i+1);
            System.out.printf("Element at index %d: %d\n", i, anArray[i]);
        }
    }
}
