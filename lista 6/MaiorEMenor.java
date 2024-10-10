package vetor3;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextDouble();
        }

        System.out.println("Vetor: ");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        double menor = numeros[0];
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nO menor número é: " + menor);
        System.out.println("O maior número é: " + maior);

    }
}