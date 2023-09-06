public class Pessoa {

    private String nome;
    private Cargo cargo = new Cargo();


    public Pessoa(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    
}
