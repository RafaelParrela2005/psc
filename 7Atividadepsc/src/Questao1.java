
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		
		
		// Gerando a matriz5x5
		for(i = 0; i < matriz.length; i++)
			for(j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe um número: ");
				matriz[i][j] = input.nextInt();
			}
		System.out.println("Matriz informada:\n Imprimindo a Matriz");
		
		//a) Imprimindo a matriz
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++)
				System.out.printf("%2d ", matriz[i][j]);
			System.out.println();
		}
		
		System.out.println("Imprimindo valores armazendados nas linhas pares e colunas ímpares");
		
		//b) Imprimindo os elementos armazenados nas linhas pares e nas colunas ímpares
		for(i = 0; i < matriz.length; i += 2) {
			for(j = 1; j < matriz[i].length; j += 2)
				System.out.printf("%2d ", matriz[i][j]);
			System.out.println();		
		}

		System.out.println("Matriz Transposta");
		//c) Imprimindo matriz transposta
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++)
				System.out.printf("%2d ", matriz[j][i]);
			System.out.println();
		}
		
		//d) Trocando os elementos da diagonal principal com os elementos da diagonal secundária
		System.out.println("Matriz com diagonais trocadas");
		int k, l;
		for(i = 0, j = 0, k = 0, l = matriz[k].length - 1; i < matriz.length && j < matriz[i].length; i++, j++, k++, l--) {
			int valorDiagonal1 = matriz[i][j];
			int valorDiagonal2 = matriz[k][l];
			matriz[i][j] = valorDiagonal2;
			matriz[k][l] = valorDiagonal1;

		}
		// Imprimindo a matriz novamente
		for(i = 0; i < matriz.length; i++) {
			for(j = 0; j < matriz[i].length; j++)
				System.out.printf("%2d ", matriz[i][j]);
			System.out.println();
		}
	}

}
