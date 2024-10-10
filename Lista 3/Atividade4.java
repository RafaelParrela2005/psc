import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para acumular o total de salários e número de filhos
        double somaSalarios = 0;
        int somaFilhos = 0;
        int totalHabitantes = 0;

        while (true) {
            System.out.print("Informe o salário do habitante (ou um número negativo para encerrar): ");
            double salario = scanner.nextDouble();

            // Se o salário for negativo, o programa deve encerrar
            if (salario < 0) {
                break;
            }

            System.out.print("Informe o número de filhos do habitante: ");
            int numFilhos = scanner.nextInt();

            // Atualiza as somas e o total de habitantes
            somaSalarios += salario;
            somaFilhos += numFilhos;
            totalHabitantes++;
        }

        // Calcula e exibe os resultados
        if (totalHabitantes > 0) {
            double mediaSalarios = somaSalarios / totalHabitantes;
            double mediaFilhos = (double) somaFilhos / totalHabitantes;

            System.out.printf("Média salarial da população: %.2f\n", mediaSalarios);
            System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
        } else {
            System.out.println("Nenhum dado foi registrado.");
        }
    }
}