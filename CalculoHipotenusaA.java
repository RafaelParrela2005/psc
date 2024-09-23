import java.util.Scanner;

public class CalculoHipotenusaA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = input.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("O valor da hipotenusa é: %.2f\n", hipotenusa);

        input.close();
    }
}
