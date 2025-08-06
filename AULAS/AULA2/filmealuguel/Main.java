package filmealuguel;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Filme filme1 = new Filme();

        cliente1.nome = "Alisson";
        cliente1.idade = 18;

        filme1.nome = "Shurek";
        filme1.estoque = 4;

        System.out.println(cliente1.nome);
        cliente1.alugarFilme(filme1);
    }
}
