import javax.swing.JOptionPane;

public class AreaLosangoB {
    public static void main(String[] args) {

        String diagonalMaiorStr = JOptionPane.showInputDialog(null, "Informe o valor da diagonal maior:");

        double diagonalMaior = Double.parseDouble(diagonalMaiorStr);

        String diagonalMenorStr = JOptionPane.showInputDialog(null, "Informe o valor da diagonal menor:");

        double diagonalMenor = Double.parseDouble(diagonalMenorStr);

        double area = (diagonalMaior * diagonalMenor) / 2;

        JOptionPane.showMessageDialog(null, "A área do losango é: " + area);
    }
}
