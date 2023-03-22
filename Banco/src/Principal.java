import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int numero,opcao;
        double saldo, limite, rendimento;
        do {
             opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Banco: \n (1) Conta Corrente \n (2) Conta Poupança \n (3) Sair",
                    "Entrada", JOptionPane.QUESTION_MESSAGE));
            switch (opcao) {
                case 1:
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta: ",
                            "Entrada", JOptionPane.QUESTION_MESSAGE));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo da conta: ",
                            "Entrada", JOptionPane.QUESTION_MESSAGE));
                    limite = Double.parseDouble(JOptionPane.showInputDialog(null, "Limite da conta: ",
                            "Entrada", JOptionPane.QUESTION_MESSAGE));
                    ContaCorrente cc1 = new ContaCorrente(numero, saldo, limite);
                    JOptionPane.showMessageDialog(null, "Saldo: " + cc1.getSaldo()
                                    + "\n Saldo com o limite: " + cc1.consultaSaldoTotal(),
                            "Conta Corrente: ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero da conta: ",
                            "Entrada", JOptionPane.QUESTION_MESSAGE));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Saldo da conta: ",
                            "Entrada", JOptionPane.QUESTION_MESSAGE));
                    rendimento = Double.parseDouble(JOptionPane.showInputDialog(null, "Rendimento da conta: ", "Entrada", JOptionPane.QUESTION_MESSAGE));
                    ContaPoupanca cp1 = new ContaPoupanca(numero, saldo, rendimento);
                    cp1.atualizarRendimento();
                    JOptionPane.showMessageDialog(null, "Saldo: " + cp1.getSaldo(), "\n Rendimento: ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida",
                            "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcao != 3);
    }
}