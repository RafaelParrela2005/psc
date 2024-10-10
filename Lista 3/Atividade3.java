import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar o número de pessoas assistindo a cada canal
        int pessoasCanal2 = 0;
        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal7 = 0;
        int pessoasCanal12 = 0;

        int totalPessoas = 0; // Total de pessoas consultadas

        while (true) {
            System.out.print("Informe o número do canal (2, 4, 5, 7, 12 ou 0 para encerrar): ");
            int canal = scanner.nextInt();

            // Se o canal for 0, o programa deve encerrar
            if (canal == 0) {
                break;
            }

            // Verifica se o canal informado é válido
            if (canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {
                System.out.println("Canal inválido! Tente novamente.");
                continue;
            }

            System.out.print("Informe o número de pessoas assistindo a este canal: ");
            int numPessoas = scanner.nextInt();

            // Atualiza o total de pessoas e o número de pessoas assistindo ao canal correspondente
            totalPessoas += numPessoas;
            switch (canal) {
                case 2:
                    pessoasCanal2 += numPessoas;
                    break;
                case 4:
                    pessoasCanal4 += numPessoas;
                    break;
                case 5:
                    pessoasCanal5 += numPessoas;
                    break;
                case 7:
                    pessoasCanal7 += numPessoas;
                    break;
                case 12:
                    pessoasCanal12 += numPessoas;
                    break;
            }
        }

        // Exibe os resultados
        if (totalPessoas > 0) {
            System.out.println("Percentual de audiência por canal:");
            System.out.printf("Canal 2: %.2f%%\n", (pessoasCanal2 * 100.0) / totalPessoas);
            System.out.printf("Canal 4: %.2f%%\n", (pessoasCanal4 * 100.0) / totalPessoas);
            System.out.printf("Canal 5: %.2f%%\n", (pessoasCanal5 * 100.0) / totalPessoas);
            System.out.printf("Canal 7: %.2f%%\n", (pessoasCanal7 * 100.0) / totalPessoas);
            System.out.printf("Canal 12: %.2f%%\n", (pessoasCanal12 * 100.0) / totalPessoas);
        } else {
            System.out.println("Nenhum dado de audiência foi registrado.");
        }
    }
}