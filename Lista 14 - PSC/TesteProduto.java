package produto;
import java.util.Scanner;
public class TesteProduto {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita informações para o primeiro produto
	        System.out.println("Informe o nome do primeiro produto:");
	        String nome1 = scanner.nextLine();
	        System.out.println("Informe o preço do primeiro produto:");
	        double preco1 = scanner.nextDouble();
	        scanner.nextLine();  // Consome a quebra de linha após o preço

	        Produto p1 = new Produto(nome1, preco1);
	        p1.exibe();
	        System.out.println("Preço: " + p1.getPreco());

	        // Solicita reajuste para o primeiro produto
	        System.out.println("Informe o percentual de reajuste para o primeiro produto:");
	        double percentual1 = scanner.nextDouble();
	        p1.reajustaPreco(percentual1);

	        // Exibe as informações após reajuste
	        System.out.println("Informações do primeiro produto após reajuste:");
	        p1.exibe();
	        System.out.println("Preço: " + p1.getPreco());

	        // Solicita informações para o segundo produto
	        scanner.nextLine(); // Limpa o buffer
	        System.out.println("Informe o nome do segundo produto:");
	        String nome2 = scanner.nextLine();
	        System.out.println("Informe o preço do segundo produto:");
	        double preco2 = scanner.nextDouble();

	        Produto p2 = new Produto(nome2, preco2);
	        p2.exibe();
	        System.out.println("Preço: " + p2.getPreco());


	        // Solicita reajuste para o segundo produto
	        System.out.println("Informe o percentual de reajuste para o segundo produto:");
	        double percentual2 = scanner.nextDouble();
	        p2.reajustaPreco(percentual2);

	        // Exibe as informações após reajuste
	        System.out.println("Informações do segundo produto após reajuste:");
	        p2.exibe();
	        System.out.println("Preço: " + p2.getPreco());


	        // Exibe o último ID gerado
	        System.out.println("Último ID gerado: " + Produto.getUltimoId());

	        scanner.close();
	}
	

}


