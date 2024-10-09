import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {
		//Criando as 2 matrizes
		int i, j;
		Scanner input = new Scanner(System.in);
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] resultado = new int[2][2];
		
		System.out.println("Somador de duas Matrizes 2x2: Matriz 1:");
		for(i = 0; i < matriz1.length; i++)
			for(j = 0; j < matriz1[i].length; j++) {
				System.out.println("Informe um número: ");
				matriz1[i][j] = input.nextInt();
			}
		
		System.out.println("Matriz 2:");
		for(i = 0; i < matriz2.length; i++)
			for(j = 0; j < matriz2[i].length; j++) {
				System.out.println("Informe um número: ");
				matriz2[i][j] = input.nextInt();
			}
		//Somando as 2 matrizes criadas e armazenando os valores na matriz "resultado"
		for(i = 0; i < matriz1.length; i++) 
			for(j = 0; j < matriz1[i].length; j++) 
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
				
			
		//Imprimindo o resultado
		System.out.println("Resultado:");
		for(i = 0;i < resultado.length; i++) {
			for(j = 0;j < resultado[i].length; j++)
				System.out.printf("%2d ", resultado[i][j]);
			System.out.println();
		}
	}
}
