import java.util.Scanner;

public class NumerosEntreLimites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        int num2 = scanner.nextInt();

        for (int i = Math.min(num1, num2) + 1; i < Math.max(num1, num2); i++) {
            System.out.println(i); // Exibe os números entre os dois limites
        }
    }
}
