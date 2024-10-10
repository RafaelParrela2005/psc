import java.util.Scanner;
public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 20) {
            System.out.println("Situação: Abaixo do Peso");
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Situação: Normal");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Situação: Sobrepeso");
        } else if (imc > 30 && imc <= 40) {
            System.out.println("Situação: Obesidade");
        } else {
            System.out.println("Situação: Obesidade Mórbida");
        }

        scanner.close();
    }
}
