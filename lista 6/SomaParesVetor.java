package paresvetor;

import java.util.Scanner;

public class SomaParesVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.println("Vetor: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }

        System.out.println("\nA soma dos números pares é: " + somaPares);

    }
}