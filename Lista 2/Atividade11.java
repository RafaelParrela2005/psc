import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valor da diária
        double diaria = 500.00;
        // Solicita o número de diárias
        System.out.print("Informe o número de diárias: ");
        int numeroDiarias = scanner.nextInt();

        // Calcula a taxa de serviço
        double taxaServico;
        if (numeroDiarias < 15) {
            taxaServico = 15.00;
        } else if (numeroDiarias == 15) {
            taxaServico = 10.00;
        } else {
            taxaServico = 5.00;
        }

        // Calcula o total a ser pago
        double total = (diaria * numeroDiarias) + (taxaServico * numeroDiarias);

        // Exibe o resultado
        System.out.printf("Total a ser pago pelo cliente: R$ %.2f%n", total);

        scanner.close();
    }
}