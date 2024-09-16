import javax.swing.JOptionPane;

public class CalcAnoNascB {
    public static void main(String[] args) {

        String inputAnoNasc = JOptionPane.showInputDialog("Digite seu ano de nascimento.");
        int anoNasc = Integer.parseInt(inputAnoNasc);

        String inputAnoAtual = JOptionPane.showInputDialog("Digite o ano atual.");
        int anoAtual = Integer.parseInt(inputAnoAtual);

        JOptionPane.showMessageDialog(null, "Você tem " + (anoAtual - anoNasc) + " anos de idade.");
        JOptionPane.showMessageDialog(null, "E em 2050, você terá " + (2050 - anoNasc) + " anos!");
    }
}
