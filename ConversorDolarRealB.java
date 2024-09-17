import javax.swing.JOptionPane;

public class ConversorDolarRealB{

    public static void main(String[] args) {

        String cotacaoDolarString = JOptionPane.showInputDialog("Digite a cotação do dólar em reais:");
        double cotacaoDolar = Double.parseDouble(cotacaoDolarString);

        String valorEmDolaresString = JOptionPane.showInputDialog("Digite o valor que você possui em dólares:");
        double valorEmDolares = Double.parseDouble(valorEmDolaresString);

        double valorEmReais = valorEmDolares * cotacaoDolar;

        JOptionPane.showMessageDialog(null, String.format("O valor em reais é: " + valorEmReais + "R$."));
    }
}
