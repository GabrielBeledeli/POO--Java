package atividade2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria");

        // Teste: adicionar nota válida
        System.out.println("Adicionando 7: " + aluno.adicionarNota(7)); // true
        System.out.println("Nota atual: " + aluno.consultarNota()); // 7.0

        // Teste: adicionar nota que ultrapassa 10
        System.out.println("Adicionando 5: " + aluno.adicionarNota(5)); // false
        System.out.println("Nota atual: " + aluno.consultarNota()); // 7.0

        // Teste: retirar nota válida
        System.out.println("Retirando 3: " + aluno.retirarNota(3)); // true
        System.out.println("Nota atual: " + aluno.consultarNota()); // 4.0

        // Teste: retirar nota maior que o disponível
        System.out.println("Retirando 10: " + aluno.retirarNota(10)); // false
        System.out.println("Nota atual: " + aluno.consultarNota()); // 4.0

        // Teste: adicionar nota negativa
        System.out.println("Adicionando -2: " + aluno.adicionarNota(-2)); // false
        System.out.println("Nota atual: " + aluno.consultarNota()); // 4.0
    }
}
