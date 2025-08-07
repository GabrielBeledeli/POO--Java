package atividade2;

public class Aluno {
    private String nome;
    private float nota;

    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0;
    }

    public String getNome() {
        return nome;
    }

    public float consultarNota() {
        return nota;
    }

    // Adiciona nota se não passar de 10 e for positiva
    public boolean adicionarNota(float valor) {
        if (valor > 0 && (nota + valor) <= 10) {
            nota += valor;
            return true;
        }
        return false;
    }

    // Retira nota se tiver nota suficiente
    public boolean retirarNota(float valor) {
        if (valor > 0 && nota >= valor) {
            nota -= valor;
            return true;
        }
        return false;
    }
}
