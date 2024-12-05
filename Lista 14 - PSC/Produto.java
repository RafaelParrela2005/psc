package produto;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private static int ultimoId = 1; // Atributo estático para controlar o último ID gerado

    // Construtor sem parâmetros
    public Produto() {
        this.id = ultimoId++; // Atribui o id e incrementa o último id
        this.nome = "Nome não informado"; // Nome padrão
        this.preco = 0; // Preço inicial
    }

    // Construtor com nome e preço
    public Produto(String nome, double preco) {
        this(); // Chama o construtor sem parâmetros para atribuir id
        this.nome = nome;
        setPreco(preco); // Usa o método set para validar o preço
    }

    // Métodos get e set
    public int getId() {
        return id; // Somente leitura para o id
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0; // Se o preço for negativo, atribui 0
        } else {
            this.preco = preco;
        }
    }

    // Método para exibir informações do produto
    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
    }

    // Método para reajustar o preço
    public void reajustaPreco(double percentual) {
        if (percentual < 0) {
            System.out.println("Percentual inválido.");
            return;
        }
        this.preco += (this.preco * percentual / 100); // Atualiza o preço com o percentual
    }

    // Método para acessar o último id gerado
    public static int getUltimoId() {
        return ultimoId - 1; // Retorna o último id gerado
    }
}
