package heranca;

class PessoaFisica extends Pessoa {
    private String CPF;

    // Construtor
    public PessoaFisica(String nome, String CPF) {
        super(nome);  // Chama o construtor da classe Pessoa
        this.CPF = CPF;
    }

    // Métodos de acesso
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
