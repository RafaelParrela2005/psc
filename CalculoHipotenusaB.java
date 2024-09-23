import javax.swing.JOptionPane;

public class CalculoHipotenusaB {
    public static void main(String[] args) {
        // Recebe os valores dos catetos através de uma caixa de diálogo
        String cateto1Str = JOptionPane.showInputDialog("Digite o valor do primeiro cateto:");
        String cateto2Str = JOptionPane.showInputDialog("Digite o valor do segundo cateto:");

        // Converte as strings de entrada em números double
        double cateto1 = Double.parseDouble(cateto1Str);
        double cateto2 = Double.parseDouble(cateto2Str);

        // Calcula a hipotenusa usando o Teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, String.format("O valor da hipotenusa é: %.2f", hipotenusa));
    }
}
