import java.util.Scanner;

public class CalcSalarioMinimoA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salarioFuncionario = input.nextDouble();

        System.out.println("Digite o valor do salário minimo: ");
        double salarioMinimo = input.nextDouble();

        double resultado = salarioFuncionario/salarioMinimo;
        System.out.println("O funcionário recebe um total de " + resultado + " salários mínimos.");
    }
}
