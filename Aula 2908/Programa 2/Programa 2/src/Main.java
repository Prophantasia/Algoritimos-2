import javax.swing.JOptionPane;

public class Main {

    static public boolean rodar = true;

    public static void main(String[] args) throws Exception {
        NotasAluno notas = new NotasAluno();
        Boletim boletim = new Boletim();
        Ui ui = new Ui();


        while (rodar) {

            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ui.menu, "Boletim 👀", -1));

            if (opcao == 1) {

                Double nota1 = Double.parseDouble((JOptionPane.showInputDialog(null, "Digite a primeira nota: ", "Boletim 👀", 1)));
                notas.setNota1(nota1);

                Double nota2 = Double.parseDouble((JOptionPane.showInputDialog(null, "Digite a segunda nota: ", "Boletim 👀", 1)));
                notas.setNota2(nota2);

                Double nota3 = Double.parseDouble((JOptionPane.showInputDialog(null, "Digite a terceira nota: ", "Boletim 👀", 1)));
                notas.setNota3(nota3);

                int faltas = Integer.parseInt((JOptionPane.showInputDialog(null, "Digite suas faltas: ", "Boletim 👀", 1)));
                notas.setFaltas(faltas);

            } else if (opcao == 2) {

                Resultado resultado = boletim.processar(notas);
                JOptionPane.showMessageDialog(null, "Sua media foi: " + resultado.getMedia() + "\n" + "Você foi: " + resultado.getSituacao() ,"Boletim 👀", -1);

                
            } else if (opcao == 3) {
                rodar = false;
            } else
                JOptionPane.showMessageDialog(null, "Você digitou uma opção inválida", "Oraculo 👀", 2);
    }
}
}