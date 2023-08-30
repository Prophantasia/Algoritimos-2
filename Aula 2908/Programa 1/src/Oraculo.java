public class Oraculo {

    public Info analisar(Pessoa p) {
        int idade = this.verIdade(p);
        String signo = this.verSigno(p);
        String geracao = this.verGeracao(p);

        Info info = new Info();
        info.setIdade(idade);
        info.setSigno(signo);
        info.setGeracao(geracao);

        return info;
    }

    private int verIdade(Pessoa p) {
        int idade = 2023 - p.getAno();
        return idade;
    }

    private String verSigno(Pessoa p) {
        int dia = p.getDia();
        int mes = p.getMes();

        String signo = "";
        if ((mes == 1 && dia >= 21) ||
                (mes == 2 && dia <= 18))
            signo = "Aquário";
        else if ((mes == 2 && dia >= 19) ||
                (mes == 3 && dia <= 20))
            signo = "Peixes";
        else if ((mes == 3 && dia >= 21) ||
                (mes == 4 && dia <= 20))
            signo = "Áries";
        else if ((mes == 4 && dia >= 21) ||
                (mes == 5 && dia <= 20))
            signo = "Touro";
        else if ((mes == 5 && dia >= 21) ||
                (mes == 6 && dia <= 20))
            signo = "Gêmeos";
        else if ((mes == 6 && dia >= 21) ||
                (mes == 7 && dia <= 22))
            signo = "Câncer";
        else if ((mes == 7 && dia >= 23) ||
                (mes == 8 && dia <= 22))
            signo = "Leão";
        else if ((mes == 8 && dia >= 23) ||
                (mes == 9 && dia <= 22))
            signo = "Virgem";
        else if ((mes == 9 && dia >= 23) ||
                (mes == 10 && dia <= 22))
            signo = "Libra";
        else if ((mes == 10 && dia >= 23) ||
                (mes == 11 && dia <= 21))
            signo = "Escorpião";
        else if ((mes == 11 && dia >= 22) ||
                (mes == 12 && dia <= 21))
            signo = "Sagitário";
        else
            signo = "Capricórnio";

        return signo;
    }

    private String verGeracao(Pessoa p) {
        int ano = p.getAno();

        String geracao = "";
        if (ano <= 1960)
            geracao = "Baby Boomers";
        else if (ano >= 1961 && ano <= 1980)
            geracao = "X";
        else if (ano >= 1981 && ano <= 1997)
            geracao = "Y";
        else if (ano >= 1998 && ano <= 2009)
            geracao = "Z";
        else
            geracao = "Alpha";

        return geracao;
    }

}