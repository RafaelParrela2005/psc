package vetor2;

import java.util.Scanner;

public class NegativosVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextDouble();
        }

        System.out.println("Vetor: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nPosições dos números negativos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }

    }
}