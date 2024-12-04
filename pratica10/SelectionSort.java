package pratica10;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        selectionSort(vetor);

        System.out.println("Vetor ordenado com Selection Sort:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
