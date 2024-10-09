import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Somar os dois números");
        System.out.println("2 - Multiplicar os dois números");
        System.out.println("3 - Subtrair o número maior pelo número menor");
        System.out.println("4 - Dividir o primeiro número pelo segundo");

        int opcao = scanner.nextInt();
        double resultado;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado da soma: %.2f%n", resultado);
                break;
            case 2:
                resultado = num1 * num2;
                System.out.printf("Resultado da multiplicação: %.2f%n", resultado);
                break;
            case 3:
                if (num1 == num2) {
                    resultado = 0;
                    System.out.println("Os números são iguais, resultado: 0");
                } else {
                    resultado = Math.max(num1, num2) - Math.min(num1, num2);
                    System.out.printf("Resultado da subtração: %.2f%n", resultado);
                }
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("Resultado da divisão: %.2f%n", resultado);
                }
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        scanner.close();
    }
}
