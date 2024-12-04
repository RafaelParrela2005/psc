package pratica10;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        insertionSort(vetor);

        System.out.println("Vetor ordenado com Insertion Sort:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
