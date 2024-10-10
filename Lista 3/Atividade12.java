import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade e o sexo do cliente
        System.out.print("Informe a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o sexo do cliente (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double mensalidade = 0.0;

        // Verifica a tabela de preços conforme idade e sexo
        if (sexo == 'M') { // Homens
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.00;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.00;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.00;
            } else { // Acima de 40 anos
                mensalidade = 80.00;
            }
        } else if (sexo == 'F') { // Mulheres
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.00;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.00;
            } else { // Acima de 40 anos
                mensalidade = 80.00;
            }
        } else {
            System.out.println("Sexo inválido. Informe 'M' para masculino ou 'F' para feminino.");
            scanner.close();
            return; // Encerra o programa se o sexo for inválido
        }

        // Exibe o valor da mensalidade
        System.out.printf("O valor da mensalidade a ser paga é: R$ %.2f%n", mensalidade);

        scanner.close();
    }
}
