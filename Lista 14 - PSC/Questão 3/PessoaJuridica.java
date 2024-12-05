package heranca;

class PessoaJuridica extends Pessoa {
    private String CNPJ;

    // Construtor
    public PessoaJuridica(String nome, String CNPJ) {
        super(nome);  // Chama o construtor da classe Pessoa
        this.CNPJ = CNPJ;
    }

    // Métodos de acesso
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
