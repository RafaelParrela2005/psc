package vetor5;

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = entrada.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nVetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }

        System.out.println("\nVetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }

        System.out.println("\nVetor Soma:");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.print(vetorSoma[i] + " ");
        }

    }
}