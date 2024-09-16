import javax.swing.JOptionPane;

public class CalcSalarioB {
    public static void main(String[] argos) {
        String inputSalario = JOptionPane.showInputDialog("Digite o salário atual do funcionário.");
        double salario = Double.parseDouble(inputSalario);

        JOptionPane.showMessageDialog(null,"O salário do funcionário sofreu um aumento de 25% e agora vale " + (salario * 1.25) + "R$.");
    }
}
