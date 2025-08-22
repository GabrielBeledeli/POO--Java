package atividade2;

import java.util.Scanner;

public class Calculadora {

    public int soma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }
    public double soma(double num1, double num2){
        double soma = num1 + num2;
        return soma;
    }
    public int soma(int num1, int num2, int num3){
        int soma = num1 + num2 + num3;
        return soma;
    }
}

class Main{
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Soma dois Inteiros");
        System.out.print("Digite o primeiro número: ");
        int numInt1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numInt2 = scanner.nextInt();
        System.out.print("Resultado = " + calculadora.soma(numInt1, numInt2) + "\n");
        scanner.nextLine();
    System.out.println("Soma dois Inteiros");
    System.out.print("Digite o primeiro número (pode ser decimal): ");
    double numDouble1 = scanner.nextDouble();
    System.out.print("Digite o segundo número (pode ser decimal): ");
    double numDouble2 = scanner.nextDouble();
    System.out.print("Resultado = " + calculadora.soma((int)numDouble1, (int)numDouble2) + "\n");

    System.out.println("Soma dois Doubles");
    System.out.print("Digite o primeiro número (pode ser decimal): ");
    numDouble1 = scanner.nextDouble();
    System.out.print("Digite o segundo número (pode ser decimal): ");
    numDouble2 = scanner.nextDouble();
    System.out.print("Resultado = " + calculadora.soma(numDouble1, numDouble2) + "\n");

    System.out.println("Soma Três Inteiros");
    System.out.print("Digite o primeiro número (pode ser decimal): ");
    double numDouble3 = scanner.nextDouble();
    System.out.print("Digite o segundo número (pode ser decimal): ");
    double numDouble4 = scanner.nextDouble();
    System.out.print("Digite o Terceiro número (pode ser decimal): ");
    double numDouble5 = scanner.nextDouble();
    System.out.print("Resultado = " + calculadora.soma((int)numDouble3, (int)numDouble4, (int)numDouble5) + "\n");