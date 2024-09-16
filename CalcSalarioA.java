import java.util.Scanner;

public class CalcSalarioA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário atual do funcionário: ");
        double salario = input.nextDouble();
        System.out.println("O salário do funcionário sofreu um aumento de 25% e agora vale " + (salario * 1.25) + "R$.");
        input.close();
    }
}
