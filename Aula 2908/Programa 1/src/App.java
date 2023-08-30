import javax.swing.JOptionPane;

public class App {

    static public boolean rodar = true;

    public static void main(String[] args) throws Exception {

        Pessoa p = new Pessoa();
        Ui ui = new Ui();

        while (rodar) {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ui.menu, "Oraculo 👀", -1));

            if (opcao == 1) {

                p.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: ", "Oraculo 👀", -1));

                int dia = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite o dia que você nasceu: ", "Oraculo 👀", 1));
                p.setDia(dia);

                int mes = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite o mês que você nasceu: ", "Oraculo 👀", 1));
                p.setMes(mes);

                int ano = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Digite o ano que você nasceu: ", "Oraculo 👀", 1));
                p.setAno(ano);

            } else if (opcao == 2) {

                Oraculo oraculo = new Oraculo();
                Info info = oraculo.analisar(p);
                JOptionPane.showMessageDialog(null,
                        "📿 Oráculo diz 🧙‍♂️\n" + "Esse ano você completa: " + info.getIdade()
                                + " anos.\n" + "Você é da geração " + info.getGeracao() + "\n" + "Seu signo é: "
                                + info.getSigno(),
                        "Oraculo 👀", -1);
            } else if (opcao == 3) {
                rodar = false;
            } else
                JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida", "Oraculo 👀", 2);

        }

    }
}
