public class Boletim {

    public Resultado processar(NotasAluno notas) {

        Resultado resultado = new Resultado();
        double media = this.calcularaMedia(notas);
        String situacao = this.verificarSituacao(calcularaMedia(notas), notas.getFaltas());

        resultado.setMedia(media);
        resultado.setSituacao(situacao);

        return resultado;
    }

    private double calcularaMedia(NotasAluno notas) {
        return (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
    }

    private String verificarSituacao(double media, int faltas) {

        if (media >= 6 && faltas < 4) {
            return "aprovado";

        } else {
            return "reprovado";
        }
    }
}
