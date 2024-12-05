package heranca;

class Cadastro {
    private Pessoa[] pessoas;
    private int contador; //Tem o papel de controlar quantas pessoas foram cadastradas no vetor

    // Construtor
    public Cadastro(int capacidade) {
        pessoas = new Pessoa[capacidade];
        contador = 0;
    }

    // Método para cadastrar pessoa
    public void cadastrarPessoa(Pessoa pessoa) {
        if (contador < pessoas.length) {
            pessoas[contador] = pessoa;
            contador++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    // Método para imprimir o cadastro
    public void imprimirCadastro() {
        for (int i = 0; i < contador; i++) { //Percorre o vetor de pessoas e exibi informações de cada pessoa cadastrada
            System.out.println("Nome: " + pessoas[i].getNome());
            if (pessoas[i] instanceof PessoaFisica) { //Verifica se é uma de uma classe específica ou subclasses
                System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
            } else if (pessoas[i] instanceof PessoaJuridica) {
                System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
            }
            System.out.println();
        }
    }
}
