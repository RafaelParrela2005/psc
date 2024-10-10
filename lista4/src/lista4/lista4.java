package lista4;
import javax.swing.JOptionPane;



public class lista4 {
	public static void main(String[] args) {
		questao2();
	}
	public static void metodo1() {
		String entrada;
		int numero1, numero2, soma;
		do {
		entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
		// Converte a entrada para inteiro e armazena em numero1:
		numero1 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
		// Converte a entrada para inteiro e armazena em numero2:
		numero2 = Integer.parseInt(entrada);
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		// System.exit(0);
		entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);
		}
	public static void metodo2() {
		String entrada;
		int numero1, numero2, soma;
		do {
		entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
		// Converte a entrada para inteiro e armazena em numero1:
		numero1 = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
		// Converte a entrada para inteiro e armazena em numero2:

		numero2 = Integer.parseInt(entrada);
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);
		int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (resp == JOptionPane.YES_OPTION)
		entrada = "sim";
		else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION)
		entrada = "não";
		} while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		System.exit(0);	
	}
	/*Questão 1) Os dois métodos usam o loop do-while, o programa pede a entrada de 2 números para fazer sua soma,ao final do 
	procedimento o programa mostra o resultado da operação e pede para o usuário a entrada de sim ou não, caso a entrada seja 
	"sim" o loop continua, se a entrada for "não" o programa encerra. O segundo método faz a opção de "Sim" ou "Não" de maneira
	 usando um recurso diferente do JOptionPane.*/
	public static void questao2() {
		String entrada;
		
		String opcao;
		int[] cdu = new int[3];
		int[] udc = new int[3];
		
		do {
		 entrada = JOptionPane.showInputDialog("Informe seu CDU:");
		 int a = 0,b = 0,resultado;
		 char[] entrada2 = entrada.toCharArray();
			for(int i = 0; i < entrada2.length; i++) {
				cdu[i] = Integer.parseInt(String.valueOf(entrada2[i]));
				a = a*10+cdu[i];
			}
			 for (int i = entrada2.length - 1; i >= 0; i--) {
		            b = b * 10 + Integer.parseInt(String.valueOf(entrada2[i]));
		        }

		 resultado = a + b;
		 String temp = Integer.toString(resultado);
		 char[] tempchar = temp.toCharArray();
		 int[] newResultado = new int[temp.length()];
		 int soma = 0;
		 for(int i = 0; i < temp.length(); i ++) {
			 newResultado[i] = Integer.parseInt(String.valueOf(tempchar[i]));
			 
		 }
		 for(int i = 0; i < newResultado.length;i++) {
			 soma = soma + newResultado[i] * i;
		 }
		 int resultadofinal  = soma % 10;
		 JOptionPane.showMessageDialog(null, "Seu dígito verificador é " + resultadofinal);
		 opcao = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
		} while (opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim"));
		System.exit(0);
		}
	public static void questao3() {
	String continuar;
	do {
		String entrada;
		int nota,salario,sexo,idade;
		
		do {
			entrada = JOptionPane.showInputDialog("Nota:");
			nota = Integer.parseInt(entrada);
			if(nota > 10 || nota < 0) {
				 JOptionPane.showMessageDialog(null, "Nota inválida");
			}
		
	}while (nota < 0 || nota > 10);
	 do {
		 entrada = JOptionPane.showInputDialog("Salario:");
		 salario = Integer.parseInt(entrada);
		 if(salario < 0) {
			 JOptionPane.showMessageDialog(null, "Inválido");
		 }
	 }while(salario < 0);
	 do {
		 entrada = JOptionPane.showInputDialog("Sexo:");
		 sexo = entrada.toLowerCase().charAt(0);
		  if (sexo != 'm' && sexo != 'f') {
              JOptionPane.showMessageDialog(null, "inválido");
          }
	 }while(sexo != 'm' && sexo != 'f');
	do {
		entrada = JOptionPane.showInputDialog("Idade:");
		idade = Integer.parseInt(entrada);
		if(idade > 120 || idade < 0) {
			 JOptionPane.showMessageDialog(null, "inválida");
		}
	
}while (idade < 0 || idade > 120);
	JOptionPane.showMessageDialog(null, "Sucesso!!");
	
	 continuar = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
	 
 }while(continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));
	System.exit(0);
	}
}

	

