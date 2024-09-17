import java.util.Scanner;

public class ConversorDolarRealA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a cotação do dólar em reais
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();

        // Solicitar o valor que o usuário possui em dólares
        System.out.print("Digite o valor que você possui em dólares: ");
        double valorEmDolares = scanner.nextDouble();

        // Converter o valor em dólares para reais
        double valorEmReais = valorEmDolares * cotacaoDolar;

        // Exibir o resultado
        System.out.println("O valor em reais é: " + valorEmReais);

        scanner.close();
    }
}