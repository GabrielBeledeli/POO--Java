package atividade2;
public class Forma {
    private String cor;
    private boolean preenchida;

    public Forma(String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }

    public String getCor() {
        return cor;
    }

    public boolean isPreenchida() {
        return preenchida;
    }
}
