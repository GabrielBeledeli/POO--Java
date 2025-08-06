package filmealuguel;
public class Cliente {
    String nome;
    int idade;

    Filme filmeAlugado;
    void alugarFilme(Filme filme){
        if (filme.estoque > 0){
            System.out.println("Filme Alugado");
            filme.estoque --;
            filmeAlugado = filme;
        }
        else {
            System.out.println("Filme Sem Estoque");
        }
    }
}
