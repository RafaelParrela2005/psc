package pratica10;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            array[k++] = leftArray[i++];
        }

        while (j < n2) {
            array[k++] = rightArray[j++];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 10 números para o vetor:");
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        mergeSort(vetor, 0, vetor.length - 1);

        System.out.println("Vetor ordenado com Merge Sort:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
