import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para x: ");
        double x = scanner.nextDouble();

        double resultado = calcularFuncao(x);
        System.out.println("f(" + x + ") = " + resultado);

        scanner.close();
    }

    public static double calcularFuncao(double x) {
        if (x < -2) {
            return 2 * x + 2;
        } else if (x >= -2 && x < 3) {
            return 3;
        } else { // x >= 3
            return -x;
        }
    }
}
