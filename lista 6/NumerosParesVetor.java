package vetor4;

import java.util.Scanner;

public class NumerosParesVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("\nNúmeros nas posições pares:");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.println(numeros[i]);
        }
    }
}