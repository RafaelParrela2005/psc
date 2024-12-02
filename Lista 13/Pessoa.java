import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe base representando uma pessoa com nome.
 */
class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + nome;
    }
}

/**
 * Classe representando uma pessoa física com CPF.
 */
class PessoaFisica extends Pessoa {
    private String cpf;

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }


    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}

/**
 * Classe representando uma pessoa jurídica com CNPJ.
 */
class PessoaJuridica extends Pessoa {
    private String cnpj;

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }


    public String toString() {
        return super.toString() + ", CNPJ: " + cnpj;
    }
}

/**
 * Gerencia o cadastro de pessoas, pessoas físicas e jurídicas.
 */


class Cadastro {
    private ArrayList<Pessoa> pessoas;

    public Cadastro() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void imprimirCadastro() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("Cadastro de Pessoas:");
            for (Pessoa p : pessoas) {
                System.out.println(p);
            }
        }
    }
}

/**
 * Implementa o menu interativo para cadastro e exibição de pessoas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Pessoa");
            System.out.println("2. Cadastrar Pessoa Física");
            System.out.println("3. Cadastrar Pessoa Jurídica");
            System.out.println("4. Imprimir Cadastro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    Pessoa pessoa = new Pessoa();
                    System.out.print("Digite o nome: ");
                    pessoa.setNome(scanner.nextLine());
                    cadastro.adicionarPessoa(pessoa);
                    break;
                case 2:
                    PessoaFisica pessoaFisica = new PessoaFisica();
                    System.out.print("Digite o nome: ");
                    pessoaFisica.setNome(scanner.nextLine());
                    System.out.print("Digite o CPF: ");
                    pessoaFisica.setCPF(scanner.nextLine());
                    cadastro.adicionarPessoa(pessoaFisica);
                    break;
                case 3:
                    PessoaJuridica pessoaJuridica = new PessoaJuridica();
                    System.out.print("Digite o nome: ");
                    pessoaJuridica.setNome(scanner.nextLine());
                    System.out.print("Digite o CNPJ: ");
                    pessoaJuridica.setCNPJ(scanner.nextLine());
                    cadastro.adicionarPessoa(pessoaJuridica);
                    break;
                case 4:
                    cadastro.imprimirCadastro();
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
