import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");
        int limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.println(i); // Verifica se o número é ímpar
            }
        }
    }
}
