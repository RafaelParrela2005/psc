import java.util.Scanner;

public class ConversorDolarRealA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor que você possui em dólares: ");
        double valorEmDolares = scanner.nextDouble();

        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.println("O valor em reais é: " + valorEmReais);

        scanner.close();
    }
}