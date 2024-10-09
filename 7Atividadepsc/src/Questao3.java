
import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        // Criando as 2 matrizes
        int i, j, k;
        Scanner input = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];
        
        // Leitura da Matriz 1
        System.out.println("Multiplicador de duas Matrizes 2x2: Matriz 1:");
        for (i = 0; i < matriz1.length; i++)
            for (j = 0; j < matriz1[i].length; j++) {
                System.out.println("Informe um número: ");
                matriz1[i][j] = input.nextInt();
            }
        
        // Leitura da Matriz 2
        System.out.println("Matriz 2:");
        for (i = 0; i < matriz2.length; i++)
            for (j = 0; j < matriz2[i].length; j++) {
                System.out.println("Informe um número: ");
                matriz2[i][j] = input.nextInt();
            }

        // Multiplicando a linha da primeira matriz pela coluna da segunda matriz e armazenando os valores na matriz "resultado"
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz2[0].length; j++) {
                resultado[i][j] = 0; // Inicializa o resultado antes de somar
                for (k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]; // Corrigido para multiplicação
                }
            }
        }
        
        // Imprimindo o resultado
        System.out.println("Resultado:");
        for (i = 0; i < resultado.length; i++) {
            for (j = 0; j < resultado[i].length; j++)
                System.out.printf("%2d ", resultado[i][j]);
            System.out.println();
        }
    }
}