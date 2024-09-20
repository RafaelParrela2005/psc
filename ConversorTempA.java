import java.util.Scanner;

public class ConversorTempA {
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura em Celsius: ");
        Scanner input = new Scanner(System.in);
        double C = input.nextDouble();
        double F = (C * 1.8) + 32;
        System.out.println("A temperatura " + C + "ºC é " + F + " em Fahrenheit!");
    }
}
