package model;

import java.sql.Date;

public class Produto {
    private int id;
    private int idFornecedor;
    private String nome;
    private double preco;
    private Date validade;

    // Getters e Setters:
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdFornecedor() { return idFornecedor; }
    public void setIdFornecedor(int idFornecedor) { this.idFornecedor = idFornecedor; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public Date getValidade() { return validade; }
    public void setValidade(Date validade) { this.validade = validade; }
}
