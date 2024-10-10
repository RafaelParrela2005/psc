import java.util.Scanner;
public class Atividade3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota (0 a 10): ");
        double nota3 = scanner.nextDouble();

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10) || (nota3 < 0 || nota3 > 10)) {
            System.out.println("Todas as notas devem estar no intervalo de 0 a 10.");
        } else {

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 0 && media < 3) {
                System.out.println("Média: " + media + " - REPROVADO");
            } else if (media >= 3 && media < 7) {
                System.out.println("Média: " + media + " - EXAME");
            } else if (media >= 7 && media <= 10) {
                System.out.println("Média: " + media + " - APROVADO");
            }
        }

        scanner.close();
    }


}
