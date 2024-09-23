import javax.swing.JOptionPane;

public class TabuadaB {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Informe um número:");

        int numero = Integer.parseInt(input);

        String mensagem = "Tabuada do " + numero + ":\n";
        mensagem += numero + " x 0 = " + (numero * 0) + "\n";
        mensagem += numero + " x 1 = " + (numero * 1) + "\n";
        mensagem += numero + " x 2 = " + (numero * 2) + "\n";
        mensagem += numero + " x 3 = " + (numero * 3) + "\n";
        mensagem += numero + " x 4 = " + (numero * 4) + "\n";
        mensagem += numero + " x 5 = " + (numero * 5) + "\n";
        mensagem += numero + " x 6 = " + (numero * 6) + "\n";
        mensagem += numero + " x 7 = " + (numero * 7) + "\n";
        mensagem += numero + " x 8 = " + (numero * 8) + "\n";
        mensagem += numero + " x 9 = " + (numero * 9) + "\n";
        mensagem += numero + " x 10 = " + (numero * 10) + "\n";

        JOptionPane.showMessageDialog(null, mensagem, "Tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}
