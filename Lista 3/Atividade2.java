import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Solicitar a matrícula do aluno
            System.out.print("Digite a matrícula do aluno (digite um número negativo para encerrar): ");
            int matricula = scanner.nextInt();

            // Condição para encerrar o programa
            if (matricula < 0) {
                break;
            }

            // Solicitar as três notas do aluno
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            // Calcular a média das notas
            double media = (nota1 + nota2 + nota3) / 3;

            // Verificar a situação do aluno
            if (media >= 70) {
                System.out.println("Aluno com matrícula " + matricula + " foi Aprovado com média: " + media);
            } else if (media >= 60 && media < 70) {
                System.out.println("Aluno com matrícula " + matricula + " está em Recuperação com média: " + media);
            } else {
                System.out.println("Aluno com matrícula " + matricula + " foi Reprovado com média: " + media);
            }

            System.out.println(); // Espaço para melhorar a visualização
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}