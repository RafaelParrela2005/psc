package inteiro;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Inteiro inteiro = new Inteiro();
	    int opcao;

	    	do {
	    		System.out.println("Selecione uma opção:");
	    		System.out.println("1 – Multiplicação");
	            System.out.println("2 – Potência");
	            System.out.println("3 – Divisão");
	            System.out.println("4 – Par");
	            System.out.println("5 – Sair");
	            opcao = input.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite o primeiro número:");
	                    int multiplicando = input.nextInt();
	                    System.out.println("Digite o segundo número:");
	                    int multiplicador = input.nextInt();
	                    int resultadoMultiplicacao = inteiro.multiplicacao(multiplicando, multiplicador);
	                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
	                    break;

	                case 2:
	                    System.out.println("Digite a base:");
	                    int base = input.nextInt();
	                    System.out.println("Digite o expoente:");
	                    int expoente = input.nextInt();
	                    int resultadoPotencia = inteiro.potencia(base, expoente);
	                    System.out.println("Resultado da potência: " + resultadoPotencia);
	                    break;

	                case 3:
	                    System.out.println("Digite o dividendo:");
	                    int dividendo = input.nextInt();
	                    System.out.println("Digite o divisor:");
	                    int divisor = input.nextInt();
	                    try {
	                        int resultadoDivisao = inteiro.divisao(dividendo, divisor);
	                        System.out.println("Resultado da divisão: " + resultadoDivisao);
	                    } catch (ArithmeticException e) {
	                        System.out.println(e.getMessage());
	                    }
	                    break;

	                case 4:
	                    System.out.println("Digite o número:");
	                    int numero = input.nextInt();
	                    boolean ehPar = inteiro.par(numero);
	                    System.out.println("O número " + numero + (ehPar ? " é par." : " é ímpar."));
	                    break;

	                case 5:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	            System.out.println();

	        } while (opcao != 5);

	        input.close();
	}

}
