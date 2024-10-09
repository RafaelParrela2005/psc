import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tipo de apartamento
        System.out.print("Informe o tipo de apartamento (S para Simples, D para Duplo): ");
        char tipoApto = scanner.next().toUpperCase().charAt(0);

        // Solicita a quantidade de dias
        System.out.print("Informe a quantidade de dias hospedado: ");
        int dias = scanner.nextInt();

        double diaria = 0.0;

        // Verifica a tabela de preços conforme o tipo de apartamento e número de diárias
        if (tipoApto == 'S') { // Apartamento Simples
            if (dias < 10) {
                diaria = 100.00;
            } else if (dias >= 10 && dias <= 15) {
                diaria = 90.00;
            } else { // Mais de 15 dias
                diaria = 80.00;
            }
        } else if (tipoApto == 'D') { // Apartamento Duplo
            if (dias < 10) {
                diaria = 140.00;
            } else if (dias >= 10 && dias <= 15) {
                diaria = 120.00;
            } else { // Mais de 15 dias
                diaria = 100.00;
            }
        } else {
            System.out.println("Tipo de apartamento inválido. Informe 'S' para Simples ou 'D' para Duplo.");
            scanner.close();
            return; // Encerra o programa se o tipo de apartamento for inválido
        }

        // Calcula o total a ser pago
        double total = diaria * dias;

        // Exibe o valor total a ser pago
        System.out.printf("O total a ser pago pelo hóspede é: R$ %.2f%n", total);

        scanner.close();
    }
}
