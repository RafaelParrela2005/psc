import javax.swing.JOptionPane;

public class ConversorTempB {
    public static void main(String[] args) {

        String cStr = JOptionPane.showInputDialog(null, "Digite uma temperatura em Celsius.");

        double C = Double.parseDouble(cStr);

        double F = (C * 1.8) + 32;

        JOptionPane.showMessageDialog(null, "A temperatura " + C + "ºC é " + F + " em Fahrenheit!");
    }
}
