import java.util.Scanner;

public class CalcEsferaA {

    public static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        double raio = input.nextDouble();

        double comprimento = 2 * PI * raio;

        double area = 4 * PI * Math.pow(raio, 2);

        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("Comprimento da esfera: %.2f%n", comprimento);
        System.out.printf("Área da esfera: %.2f%n", area);
        System.out.printf("Volume da esfera: %.2f%n", volume);

        input.close();
    }
}
