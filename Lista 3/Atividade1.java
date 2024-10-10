import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countNotasAltas = 0; // Contador de alunos com nota >= 90
        int countReprovados = 0; // Contador de alunos reprovados por nota < 70 ou faltas >= 20
        double maiorNota = Double.MIN_VALUE; // Inicializa com o menor valor possível
        double menorNota = Double.MAX_VALUE; // Inicializa com o maior valor possível
        double somaNotas = 0; // Para calcular a média
        int totalAlunos = 0; // Contador de alunos

        while (true) {
            System.out.print("Informe a nota final do aluno (ou um número negativo para encerrar): ");
            double nota = scanner.nextDouble();

            // Se a nota for negativa, o programa deve terminar
            if (nota < 0) {
                break;
            }

            System.out.print("Informe o total de faltas do aluno: ");
            int faltas = scanner.nextInt();

            // Atualiza a soma de notas e o total de alunos
            somaNotas += nota;
            totalAlunos++;

            // Verifica a maior e a menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            // Verifica se a nota é maior ou igual a 90
            if (nota >= 90) {
                countNotasAltas++;
            }

            // Verifica se o aluno foi reprovado por nota ou por falta
            if (nota < 70 || faltas >= 20) {
                countReprovados++;
            }
        }

        // Exibe os resultados
        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;
            System.out.println("Total de alunos com nota maior ou igual a 90: " + countNotasAltas);
            System.out.println("Total de alunos reprovados por nota ou falta: " + countReprovados);
            System.out.println("A maior nota: " + maiorNota);
            System.out.println("A menor nota: " + menorNota);
            System.out.println("A média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi registrado.");
        }
    }
}