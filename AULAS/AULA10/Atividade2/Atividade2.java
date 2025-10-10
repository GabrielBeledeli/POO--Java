package Atividade2;
public class Atividade2 {

    public static void cadastrarUsuario(Usuario usuario) throws IdadeInvalidaException {
        if (usuario.getIdade() < 18) {
            // Lança a exceção se o usuário for menor de idade
            throw new IdadeInvalidaException("Cadastro não permitido. O usuário deve ter no mínimo 18 anos.");
        }
        System.out.println("Usuário '" + usuario.getNome() + "' cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        // Teste 1: Usuário com idade válida
        try {
            Usuario usuario1 = new Usuario("Carlos", 25);
            cadastrarUsuario(usuario1);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }

        System.out.println("-------------------------------------");

        // Teste 2: Usuário com idade inválida
        try {
            Usuario usuario2 = new Usuario("Ana", 16);
            cadastrarUsuario(usuario2);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}
