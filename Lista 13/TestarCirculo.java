import java.util.Scanner;

public class TestarCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe a coordenada x do círculo: ");
        int x = scanner.nextInt();
        System.out.print("Informe a coordenada y do círculo: ");
        int y = scanner.nextInt();
        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();


        Circulo circulo = new Circulo(x, y, raio);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Mover no eixo X: ");
                    int moveX = scanner.nextInt();
                    System.out.print("Mover no eixo Y: ");
                    int moveY = scanner.nextInt();
                    circulo.moveX(moveX);
                    circulo.moveY(moveY);
                    System.out.println("Círculo movido com sucesso.");
                    break;
                case 2:
                    System.out.print("Informe o fator para aumentar o raio: ");
                    double fator = scanner.nextDouble();
                    circulo.aumenta(fator);
                    System.out.println("Raio aumentado com sucesso.");
                    break;
                case 3:
                    System.out.println("\nInformações do Círculo:");
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
