package AULA3.atividade2;

public class aluno {
    private String nome;
    private int nota;

    public String getNome() { return nome; }
    public int getNota() { return nota; }

    public void setNota (int nota) {
        if (this.nota > 0 && this.nota <= 10){
            this.nota = nota;
        }
        else if (this.nota > 10){
            this.nota = 10;
        }
        else{
            this.nota = 0;
        }
    }

}
