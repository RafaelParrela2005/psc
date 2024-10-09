import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro lado em cm: ");
        double x = scanner.nextDouble();

        System.out.print("Informe o segundo lado em cm: ");
        double y = scanner.nextDouble();

        System.out.print("Informe o terceiro lado em cm: ");
        double z = scanner.nextDouble();

        if (podeSerTriangulo(x, y, z)) {
            System.out.println("Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Resposta: os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
        }

        scanner.close();
    }

    public static boolean podeSerTriangulo(double a, double b, double c) {
        boolean cond1 = Math.abs(b - c) < a && a < b + c;
        boolean cond2 = Math.abs(a - c) < b && b < a + c;
        boolean cond3 = Math.abs(a - b) < c && c < a + b;

        return cond1 && cond2 && cond3;
    }
}
