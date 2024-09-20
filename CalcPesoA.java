import java.util.Scanner;

public class CalcPesoA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa: ");
        double peso = input.nextDouble();

        double resultado = peso*1.15;
        System.out.println("+15% = " + resultado);
        resultado = peso * 1.20;
        System.out.println("+20% = " + resultado);
    }
}
