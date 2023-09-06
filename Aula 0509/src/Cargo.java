public class Cargo {
    private String descricao;
    private double salario;

    public Cargo(String desc, double sal) {
        this.descricao = desc;
        this.salario = sal;
    }

    public Cargo() {

    }

    public String getDescricao() {
        return descricao;
    }

    public double getSalario() {
        return salario;
    }
 
}