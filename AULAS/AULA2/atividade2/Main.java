package atividade2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.print("Digite a matrícula do aluno: ");
        aluno.matricula = scanner.nextInt();
        scanner.nextLine(); 

        aluno.adicionarNotas(scanner);

        aluno.exibirBoletim();

        scanner.close();
    }
}