import java.util.Scanner;

public class PotenciaSemMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base:");
        int base = scanner.nextInt();
        System.out.println("Informe o expoente:");
        int expoente = scanner.nextInt();
        int potencia = 1;

        for (int i = 0; i < expoente; i++) {
            potencia *= base; // Multiplica repetidamente para calcular a potência
        }
        System.out.println(base + " elevado a " + expoente + " é: " + potencia);
    }
}