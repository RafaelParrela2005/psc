import java.util.Scanner;

public class MaiorMenorDezNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o número " + i + ":");
            int num = scanner.nextInt();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
