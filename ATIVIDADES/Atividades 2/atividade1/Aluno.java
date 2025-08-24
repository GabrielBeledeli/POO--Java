
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    String matricula;
    String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Matricula: " + matricula + ", Curso: " + curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public class Main{
        public static void main(String[] args) {
            List<Aluno> alunos = new ArrayList<>();
            alunos.add(new Aluno("Alice", "2023001", "Engenharia de Software"));

            alunos.add(new Aluno("Bob", "2023002", "Ciência da Computação"));

            alunos.add(new Aluno("Carlos", "2023003", "Sistemas de Informação"));

            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}