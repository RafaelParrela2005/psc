import javax.swing.JOptionPane;

public class MediaAritmeticaB {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculadora de Média Aritmética");

        String inputNotaUm = JOptionPane.showInputDialog("Digite a primeira nota:");
        double notaUm = Double.parseDouble(inputNotaUm);

        String inputNotaDois = JOptionPane.showInputDialog("Digite a segunda nota:");
        double notaDois = Double.parseDouble(inputNotaDois);

        String inputNotaTres = JOptionPane.showInputDialog("Digite a terceira nota:");
        double notaTres = Double.parseDouble(inputNotaTres);

        double media = (notaUm + notaDois + notaTres) / 3;

        JOptionPane.showMessageDialog(null, "A média aritmética das três notas é: " + media);
    }
}
