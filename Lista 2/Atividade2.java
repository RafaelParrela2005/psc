import  java.util.Scanner;

public class Atividade2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");

            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }
}
