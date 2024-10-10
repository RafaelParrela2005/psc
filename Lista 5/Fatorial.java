import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular o fatorial:");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Número inválido.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i; // Multiplica para calcular o fatorial
            }
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}
