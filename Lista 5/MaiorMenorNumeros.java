import java.util.Scanner;

public class MaiorMenorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, num;

        while (true) {
            System.out.println("Informe um número (ou -1 para sair):");
            num = scanner.nextInt();
            if (num == -1) break;
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
