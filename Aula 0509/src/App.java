public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa[] pessoinha = new Pessoa[2];
        pessoinha[0] = new Pessoa("João", new Cargo("Gari", 5000));
        pessoinha[1] = new Pessoa("Maria", new Cargo("Encanador", 10000));
        
        System.out.println("\n---Lista de pessoas---");

        for (Pessoa item : pessoinha) {    
            System.out.println("\nNome: "+ item.getNome()+ "\nTrabalho: " + item.getCargo().getDescricao() + "\nSalario: " +  item.getCargo().getSalario());
        }

    }
}
