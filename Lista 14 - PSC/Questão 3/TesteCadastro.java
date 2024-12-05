package heranca;
import java.util.Scanner;

public class TesteCadastro {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro(5);  // Capacidade para 5 pessoas no cadastro
        int opcao;

        do {
            System.out.println("Menu de Cadastro:");
            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada

            switch (opcao) {
                case 1: // Cadastrar Pessoa Física
                    System.out.println("Cadastro Pessoa Física:");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
                    cadastro.cadastrarPessoa(pessoaFisica);
                    break;

                case 2: // Cadastrar Pessoa Jurídica
                    System.out.println("Cadastro Pessoa Jurídica:");
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();
                    PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
                    cadastro.cadastrarPessoa(pessoaJuridica);
                    break;

                case 3: // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);  // O loop continua até a opção 3 (sair) ser escolhida

        // Imprime todos os cadastros ao sair
        cadastro.imprimirCadastro();
        
        scanner.close();
    }
}
