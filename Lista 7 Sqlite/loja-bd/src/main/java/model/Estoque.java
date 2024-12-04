package model;

public class Estoque {
    private int idProduto;
    private String cnpjFilial;
    private int quantidade;

    // Getters e Setters:
    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }

    public String getCnpjFilial() { return cnpjFilial; }
    public void setCnpjFilial(String cnpjFilial) { this.cnpjFilial = cnpjFilial; }
    
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
}
