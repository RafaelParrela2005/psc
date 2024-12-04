package pratica10;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Métodos de Ordenação ===");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Quick Sort");
            System.out.println("5 - Merge Sort");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                System.out.println("Programa encerrado. Até mais!");
                break;
            }

            int[] vetor = new int[10];
            System.out.println("Informe 10 números para o vetor:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (escolha) {
                case 1 -> {
                    System.out.println("Executando Bubble Sort...");
                    BubbleSort.bubbleSort(vetor);
                }
                case 2 -> {
                    System.out.println("Executando Selection Sort...");
                    SelectionSort.selectionSort(vetor);
                }
                case 3 -> {
                    System.out.println("Executando Insertion Sort...");
                    InsertionSort.insertionSort(vetor);
                }
                case 4 -> {
                    System.out.println("Executando Quick Sort...");
                    QuickSort.quickSort(vetor, 0, vetor.length - 1);
                }
                case 5 -> {
                    System.out.println("Executando Merge Sort...");
                    MergeSort.mergeSort(vetor, 0, vetor.length - 1);
                }
                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
            }

            System.out.println("Vetor ordenado:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }

        scanner.close();
    }
}
