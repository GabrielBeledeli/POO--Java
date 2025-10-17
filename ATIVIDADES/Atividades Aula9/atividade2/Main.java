package atividade2;
interface Autenticavel {
    boolean autenticar(String senha);
}

abstract class Pessoa implements Autenticavel {
    private final String senhaCorreta = "abcd";

    @Override
    public boolean autenticar(String senha) {
        if (senhaCorreta.equals(senha)) {
            System.out.println(getTipo() + " autenticado com sucesso!");
            return true;
        } else {
            System.out.println("Senha incorreta. Tente novamente.");
            return false;
        }
    }

    protected abstract String getTipo();
}

class Usuario extends Pessoa {
    @Override
    protected String getTipo() {
        return "Usuário";
    }
}

class Administrador extends Pessoa {
    @Override
    protected String getTipo() {
        return "Administrador";
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa usuario = new Usuario();
        Pessoa administrador = new Administrador();
        usuario.autenticar("abcd"); // senha correta
        administrador.autenticar("errada"); // senha incorreta
    }
}


