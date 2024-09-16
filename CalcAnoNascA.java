import java.util.Scanner;

public class CalcAnoNascA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o seu ano de nascimento? ");
        int anoNasc = input.nextInt();

        System.out.println("Qual é o ano atual? ");
        int anoAtual = input.nextInt();

        System.out.println("Você tem: " + (anoAtual - anoNasc) + " anos de idade!");
        System.out.println("E em 2050, você vai ter " + (2050 - anoNasc) + " anos de idade!");
    }
}
