import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código do Produto, Produto, Preço");
        System.out.println("1, Sapato = R$ 99,99");
        System.out.println("2, Bolsa = R$ 103,89");
        System.out.println("3, Camisa = R$ 49,98");
        System.out.println("4, Calça = R$ 89,72");
        System.out.println("5, Blusa = R$ 97,35");

        System.out.print("Informe o código do produto: ");
        int codigo = scanner.nextInt();

        String produto = "";
        double preco = 0.0;

        switch (codigo) {
            case 1:
                produto = "Sapato";
                preco = 99.99;
                break;
            case 2:
                produto = "Bolsa";
                preco = 103.89;
                break;
            case 3:
                produto = "Camisa";
                preco = 49.98;
                break;
            case 4:
                produto = "Calça";
                preco = 89.72;
                break;
            case 5:
                produto = "Blusa";
                preco = 97.35;
                break;
            default:
                System.out.println("Código do produto inválido.");
                scanner.close();
                return; // Encerra o programa caso o código seja inválido
        }

        System.out.printf("Produto: %s, Preço: R$ %.2f%n", produto, preco);

        scanner.close();
    }
}
