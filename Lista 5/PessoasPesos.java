import java.util.Scanner;

public class PessoasPesos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contMasc = 0, contFem = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o sexo da pessoa " + i + " (M/F):");
            char sexo = scanner.next().charAt(0);
            System.out.println("Informe o peso da pessoa " + i + ":");
            double peso = scanner.nextDouble();

            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                contMasc++;
            } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
                contFem++;
            }
        }
        System.out.println("Número de homens com peso entre 60 e 80 kg: " + contMasc);
        System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + contFem);
    }
}
