import java.util.Scanner;

public class MediaAritmeticaA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de Média Aritmética");

        System.out.println("Digite a primeira nota: ");
        double notaUm = input.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double notaDois = input.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double notaTres = input.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        System.out.println("A média aritmética das três notas é: " + media);

        input.close();
    }
}
