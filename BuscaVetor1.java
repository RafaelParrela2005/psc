import java.util.Scanner;

public class BuscaVetor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha o algoritmo de busca:");
            System.out.println("1 - Busca Sequencial");
            System.out.println("2 - Busca Sequencial com Sentinela");
            System.out.print("Sua escolha: ");
            int opcao = scanner.nextInt();

            System.out.print("Digite o número a ser pesquisado: ");
            int numero = scanner.nextInt();

            int comparacoes = 0;
            int posicao = -1;

            switch (opcao) {
                case 1:
                    posicao = buscaSequencial(vetor, numero);
                    comparacoes = vetor.length;
                    break;
                case 2:
                    posicao = buscaSequencialSentinela(vetor, numero);
                    comparacoes = vetor.length;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            if (posicao != -1) {
                System.out.println("Número " + numero + " encontrado na posição " + posicao + ".");
            } else {
                System.out.println("Número " + numero + " não encontrado.");
            }

            System.out.println("Número de comparações realizadas: " + comparacoes);

            System.out.print("\nDeseja realizar outra pesquisa? (S/N): ");
            char resposta = scanner.next().toUpperCase().charAt(0);
            continuar = (resposta == 'S');
        }

        scanner.close();
    }

    public static int buscaSequencial(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaSequencialSentinela(int[] vetor, int numero) {
        int[] novoVetor = new int[vetor.length + 1];
        System.arraycopy(vetor, 0, novoVetor, 0, vetor.length);
        novoVetor[vetor.length] = numero;

        int i = 0;
        while (novoVetor[i] != numero) {
            i++;
        }

        if (i == vetor.length) {
            return -1;
        } else {
            return i;
        }
    }
}
