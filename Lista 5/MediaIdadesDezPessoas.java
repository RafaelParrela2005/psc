import java.util.Scanner;

public class MediaIdadesDezPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        System.out.println("A média das idades é: " + (double) somaIdades / 10);
    }
}
