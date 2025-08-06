package atividade1;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "A arte da guerra";
        livro1.autor = "Sun Tzu";
        livro1.isbn = "978-8542805093";

        livro1.exibirDados();
    }
}
