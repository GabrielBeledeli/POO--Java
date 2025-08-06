package atividade2;

public class Aluno {
    String nome;
    int matricula;
    java.util.ArrayList<Float> notas = new java.util.ArrayList<>();

    void adicionarNota(float nota) {
        notas.add(nota);
    }

    void adicionarNotas(java.util.Scanner scanner) {
        System.out.print("Quantas notas deseja adicionar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            String entrada = scanner.nextLine().replace(',', '.');
            float nota = Float.parseFloat(entrada);
            adicionarNota(nota);
        }
    }

    void calcularMedia(){
        float soma = 0;
        for(float nota : notas){
            soma += nota;
        }
        float media = notas.size() > 0 ? soma / notas.size() : 0;
        System.out.println("A média do aluno " + nome + " é: " + media);
    }

    void exibirBoletim(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + notas);
        calcularMedia();
    }

}
