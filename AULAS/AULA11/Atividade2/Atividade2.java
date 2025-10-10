package Atividade2;
interface FonteDeDados {
    void lerDados();
}
class BancoDeDados implements FonteDeDados {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do BANCO DE DADOS REAL...");
    }
}
class BancoDeDadosFalso implements FonteDeDados {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados de um ARQUIVO DE TESTE EM MEMÓRIA...");
    }
}
class Relatorio {
    private final FonteDeDados fonteDeDados;

    // A dependência é "injetada" via construtor.
    public Relatorio(FonteDeDados fonte) {
        this.fonteDeDados = fonte;
    }

    public void gerar() {
        System.out.println("Gerando relatório com os dados fornecidos...");
        // Utiliza a dependência injetada, sem saber qual é a implementação.
        this.fonteDeDados.lerDados();
    }
}

public class Atividade2 {
    public static void main(String[] args) {
        System.out.println("--- Cenário de Produção ---");
        // A dependência real é criada externamente.
        FonteDeDados bancoReal = new BancoDeDados();
        // A dependência é injetada na classe Relatorio.
        Relatorio relatorioDeProducao = new Relatorio(bancoReal);
        // O método é chamado.
        relatorioDeProducao.gerar();

        System.out.println("\n--- Cenário de Teste (Vantagem da DI) ---");
        // Uma dependência falsa (mock) é criada para o teste.
        FonteDeDados bancoFalso = new BancoDeDadosFalso();
        // O mock é injetado na classe Relatorio.
        Relatorio relatorioDeTeste = new Relatorio(bancoFalso);
        // O método é chamado, permitindo testar a classe Relatorio isoladamente.
        relatorioDeTeste.gerar();
    }
}
