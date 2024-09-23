import javax.swing.JOptionPane;

public class CalcEsferaB {

    public static final double PI = Math.PI;

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor do raio da esfera:");

        double raio = Double.parseDouble(input);

        double comprimento = 2 * PI * raio;

        double area = 4 * PI * Math.pow(raio, 2);

        double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        String mensagem = String.format("Comprimento da esfera: %.2f\nÁrea da esfera: %.2f\nVolume da esfera: %.2f",
                comprimento, area, volume);

        JOptionPane.showMessageDialog(null, mensagem, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}
