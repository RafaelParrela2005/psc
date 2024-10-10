import java.util.Scanner;

public class Mulheres20a40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contFeminino = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);
            System.out.println("Informe a idade da pessoa " + i + ":");
            int idade = scanner.nextInt();

            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                contFeminino++;
            }
        }
        System.out.println("Número de mulheres entre 20 e 40 anos: " + contFeminino);
    }
}
