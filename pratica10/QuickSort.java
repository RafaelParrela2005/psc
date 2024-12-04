package pratica10;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("Vetor ordenado com Quick Sort:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
