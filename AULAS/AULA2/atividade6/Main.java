package atividade6;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.nome = "Engenharia de Software";
        curso.codigo = 12345;
        curso.carga_horaria = 120;

        curso.exibirDados();
    }
}
