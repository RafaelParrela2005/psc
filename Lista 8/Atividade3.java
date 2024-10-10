import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da primeira sequência
        System.out.println("Digite os números da primeira sequência (digite -1 para encerrar):");
        List<Integer> sequenciaA = new ArrayList<>();
        int num;
        while ((num = scanner.nextInt()) != -1) {
            sequenciaA.add(num);
        }

        // Leitura da segunda sequência
        System.out.println("Digite os números da segunda sequência (digite -1 para encerrar):");
        List<Integer> sequenciaB = new ArrayList<>();
        while ((num = scanner.nextInt()) != -1) {
            sequenciaB.add(num);
        }

        // Exibindo as sequências
        System.out.println("Sequência A: " + sequenciaA);
        System.out.println("Sequência B: " + sequenciaB);

        // Criando conjuntos A e B
        int[] conjuntoA = criarConjunto(sequenciaA);
        int[] conjuntoB = criarConjunto(sequenciaB);

        // Criando conjunto C (união de A e B)
        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        // Exibindo os conjuntos
        System.out.println("Conjunto A: " + arrayParaString(conjuntoA));
        System.out.println("Conjunto B: " + arrayParaString(conjuntoB));
        System.out.println("Conjunto C (A ∪ B): " + arrayParaString(conjuntoC));

        scanner.close();
    }

    // Cria um conjunto a partir de uma lista, garantindo que não haja elementos duplicados
    public static int[] criarConjunto(List<Integer> lista) {
        List<Integer> conjunto = new ArrayList<>();
        for (int num : lista) {
            if (!contem(conjunto.stream().mapToInt(i -> i).toArray(), num)) {
                conjunto.add(num);
            }
        }
        return conjunto.stream().mapToInt(i -> i).toArray();
    }

    // Verifica se o vetor contém um determinado número (usando pesquisa binária)
    public static boolean contem(int[] array, int chave) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == chave) {
                return true;
            }
            if (array[meio] < chave) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return false;
    }

    // Gera a união de dois conjuntos
    public static int[] uniao(int[] a, int[] b) {
        List<Integer> uniao = new ArrayList<>();
        for (int num : a) {
            if (!contem(uniao.stream().mapToInt(i -> i).toArray(), num)) {
                uniao.add(num);
            }
        }
        for (int num : b) {
            if (!contem(uniao.stream().mapToInt(i -> i).toArray(), num)) {
                uniao.add(num);
            }
        }
        return uniao.stream().mapToInt(i -> i).toArray();
    }

    // Converte um array de inteiros para uma string formatada
    public static String arrayParaString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
