import javax.swing.JOptionPane;

public class CalcPesoB {
    public static void main(String[] args) {
        String pesoStr = JOptionPane.showInputDialog(null, "Digite o peso da pessoa.");
        double peso = Double.parseDouble(pesoStr);

        double resultadoA = peso * 1.15;
        double resultadoB = peso * 1.20;
        JOptionPane.showMessageDialog(null, "Respectivamente, o peso seria (+15% e +20%): " + resultadoA + " e " + resultadoB);
    }
}
