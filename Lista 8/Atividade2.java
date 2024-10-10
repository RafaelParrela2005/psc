import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        System.out.println("Digite 10 números em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            if (i > 0 && numeros[i] < numeros[i - 1]) {
                System.out.println("Os números devem ser inseridos em ordem crescente.");
                return;
            }
        }

        // Loop para pesquisar números
        while (true) {
            System.out.println("Digite um número para pesquisar (ou -1 para sair):");
            int numeroParaPesquisar = scanner.nextInt();
            if (numeroParaPesquisar == -1) {
                break;
            }

            int comparacoes = 0;
            int resultado = pesquisaBinaria(numeros, numeroParaPesquisar, comparacoes);

            if (resultado != -1) {
                System.out.println("Número " + numeroParaPesquisar + " encontrado na posição " + resultado + ".");
            } else {
                System.out.println("Número " + numeroParaPesquisar + " não encontrado.");
            }
            System.out.println("Total de comparações: " + comparacoes);
        }
        scanner.close();
    }

    public static int pesquisaBinaria(int[] array, int chave, int comparacoes) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            comparacoes++; // Incrementa o contador de comparações
            int meio = esquerda + (direita - esquerda) / 2;

            // Verifica se a chave está presente na posição do meio
            if (array[meio] == chave) {
                return meio; // Retorna a posição
            }

            // Se a chave for maior, ignora a metade esquerda
            if (array[meio] < chave) {
                esquerda = meio + 1;
            } else { // Se a chave é menor, ignora a metade direita
                direita = meio - 1;
            }
        }
        return -1; // Retorna -1 se a chave não for encontrada
    }
}
