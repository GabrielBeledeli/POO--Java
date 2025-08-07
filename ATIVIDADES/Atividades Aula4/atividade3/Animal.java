package atividade3;

public class Animal {
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

    public void setEspecie(String novaEspecie) {
        if (novaEspecie != null && !novaEspecie.isEmpty()) {
            especie = novaEspecie;
        }
    }

    public void setNome(String novoNome) {
        if (novoNome != null && !novoNome.isEmpty()) {
            nome = novoNome;
        }
    }
}
