import javax.swing.JOptionPane;

public class MediaAritmeticaB {
    public static void main(String[] args) {
        // Mensagem inicial
        JOptionPane.showMessageDialog(null, "Calculadora de Média Aritmética");

        // Inserção das notas do usuário
        String inputNotaUm = JOptionPane.showInputDialog("Digite a primeira nota:");
        double notaUm = Double.parseDouble(inputNotaUm);

        String inputNotaDois = JOptionPane.showInputDialog("Digite a segunda nota:");
        double notaDois = Double.parseDouble(inputNotaDois);

        String inputNotaTres = JOptionPane.showInputDialog("Digite a terceira nota:");
        double notaTres = Double.parseDouble(inputNotaTres);

        // Cálculo da média aritmética
        double media = (notaUm + notaDois + notaTres) / 3;

        // Saída do resultado teste
        JOptionPane.showMessageDialog(null, "A média aritmética das três notas é: " + media);
    }
}
