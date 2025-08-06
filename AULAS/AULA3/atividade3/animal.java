package AULA3.atividade3;

public class animal {
    private String nome;
    private String especie;

    public String consultarNomeEspecie() {
        return "Nome: " + getNome() + ", Espécie: " + getEspecie();
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            nome = novoNome;
        }
    }
}
