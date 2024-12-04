package pratica10;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        bubbleSort(vetor);

        System.out.println("Vetor ordenado com Bubble Sort:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
