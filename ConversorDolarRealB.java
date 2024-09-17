import javax.swing.JOptionPane;

public class ConversorDolarRealB{

    public static void main(String[] args) {

        // Solicitar a cotação do dólar em reais usando JOptionPane
        String cotacaoDolarString = JOptionPane.showInputDialog("Digite a cotação do dólar em reais:");
        double cotacaoDolar = Double.parseDouble(cotacaoDolarString);

        // Solicitar o valor que o usuário possui em dólares
        String valorEmDolaresString = JOptionPane.showInputDialog("Digite o valor que você possui em dólares:");
        double valorEmDolares = Double.parseDouble(valorEmDolaresString);

        // Converter o valor em dólares para reais
        double valorEmReais = valorEmDolares * cotacaoDolar;

        // Exibir o resultado com JOptionPane
        JOptionPane.showMessageDialog(null, String.format("O valor em reais é: " + valorEmReais + "R$."));
    }
}
