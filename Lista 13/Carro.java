import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe que representa um veículo.
 * Contém informações básicas como marca, modelo, número do chassi, placa e cor.
 */
class Veiculo {

    private String marca;
    private String modelo;
    private String numeroChassi;
    private String placa;
    private String cor;

    /**
     * Obtém a marca do veículo.
     * @return Marca do veículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca do veículo.
     * @param marca Marca do veículo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Retorna uma representação textual do veículo.
     * @return String contendo os detalhes do veículo.
     */
    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Número do Chassi: " + numeroChassi +
                ", Placa: " + placa + ", Cor: " + cor;
    }
}

/**
 * Classe responsável pelo cadastro e exibição de veículos.
 */
class Cadastro {

    private ArrayList<Veiculo> veiculos;

    public Cadastro() {
        veiculos = new ArrayList<>();
    }

    /**
     * Método para cadastrar um novo veículo.
     * Solicita informações do usuário e adiciona um novo veículo à lista.
     */
    public void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        System.out.print("Digite a marca do veículo: ");
        veiculo.setMarca(scanner.nextLine());

        System.out.print("Digite o modelo do veículo: ");
        veiculo.setModelo(scanner.nextLine());

        System.out.print("Digite o número do chassi: ");
        veiculo.setNumeroChassi(scanner.nextLine());

        System.out.print("Digite a placa do veículo: ");
        veiculo.setPlaca(scanner.nextLine());

        System.out.print("Digite a cor do veículo: ");
        veiculo.setCor(scanner.nextLine());

        veiculos.add(veiculo);
        System.out.println("Veículo cadastrado com sucesso!\n");
    }

    /**
     * Exibe todos os veículos cadastrados.
     */
    public void imprimirVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Veículos cadastrados:");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
    }
}

/**
 * Classe principal para executar o sistema de cadastro de veículos.
 */
public class Carro {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu de Opções:");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Imprimir veículos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastro.cadastrarVeiculo();
                    break;
                case 2:
                    cadastro.imprimirVeiculos();
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
