import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0, quantidade = 0, idade;

        while (true) {
            System.out.println("Informe uma idade (ou -1 para sair):");
            idade = scanner.nextInt();
            if (idade == -1) break; // Condição para sair do loop
            somaIdades += idade; // Soma as idades
            quantidade++;
        }
        if (quantidade > 0) {
            System.out.println("A média das idades é: " + (double) somaIdades / quantidade);
        }
    }
}
