
import dao.*;
import model.*;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Instanciar DAOs:
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        IdentificacaoDAO identificacaoDAO = new IdentificacaoDAO();
        FilialDAO filialDAO = new FilialDAO();
        EstoqueDAO estoqueDAO = new EstoqueDAO();

        // Criar tabelas:
        fornecedorDAO.criarTabela();
        produtoDAO.criarTabela();
        identificacaoDAO.criarTabela();
        filialDAO.criarTabela();
        estoqueDAO.criarTabela();

        // Criar e inserir exemplos de Fornecedor:
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Fornecedor A");
        fornecedor1.setTelefone("123456789");
        fornecedor1.setEndereco("Rua A, 123");
        fornecedorDAO.inserir(fornecedor1);

        // Criar e inserir exemplos de Produto:
        Produto produto1 = new Produto();
        produto1.setIdFornecedor(fornecedor1.getId());
        produto1.setNome("Produto A");
        produto1.setPreco(10.0);
        produto1.setValidade(Date.valueOf("2025-12-31"));
        produtoDAO.inserir(produto1);

        // Criar e inserir exemplos de Identificação:
        Identificacao identificacao1 = new Identificacao();
        identificacao1.setId(produto1.getId());
        identificacao1.setNome("ID Produto A");
        identificacao1.setDescricao("Descrição do Produto A");
        identificacaoDAO.inserir(identificacao1);

        // Criar e inserir exemplos de Filial:
        Filial filial1 = new Filial();
        filial1.setCnpj("12345678000123");
        filial1.setNome("Filial A");
        filial1.setTelefone("987654321");
        filial1.setEndereco("Avenida B, 456");
        filialDAO.inserir(filial1);

        // Criar e inserir exemplos de Estoque:
        Estoque estoque1 = new Estoque();
        estoque1.setIdProduto(produto1.getId());
        estoque1.setCnpjFilial(filial1.getCnpj());
        estoque1.setQuantidade(100);
        estoqueDAO.inserir(estoque1);

        // Listar todos os fornecedores:
        System.out.println("Fornecedores:");
        fornecedorDAO.listar().forEach(fornecedor -> System.out.println(fornecedor.getNome()));

        // Listar todos os produtos:
        System.out.println("Produtos:");
        produtoDAO.listar().forEach(produto -> System.out.println(produto.getNome()));

        // Listar todas as identificações:
        System.out.println("Identificações:");
        identificacaoDAO.listar().forEach(identificacao -> System.out.println(identificacao.getNome()));

        // Listar todas as filiais:
        System.out.println("Filiais:");
        filialDAO.listar().forEach(filial -> System.out.println(filial.getNome()));

        // Listar todos os estoques:
        System.out.println("Estoques:");
        estoqueDAO.listar().forEach(estoque -> System.out.println("Produto ID: " + estoque.getIdProduto() + ", Filial CNPJ: " + estoque.getCnpjFilial()));
    }
}
