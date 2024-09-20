import javax.swing.JOptionPane;

public class CalcSalarioMinimoB {

    public static void main(String[] args) {
        String salarioFuncionarioStr = JOptionPane.showInputDialog(null, "Digite o salario do funcionário.");
        double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);

        String salarioMinimoStr = JOptionPane.showInputDialog(null, "Digite o salario minimo.");
        double salarioMinimo = Double.parseDouble(salarioMinimoStr);

        double resultado = salarioFuncionario/salarioMinimo;
        JOptionPane.showMessageDialog(null, "A quantidade de salários mínimos é: " + resultado);
    }
}
