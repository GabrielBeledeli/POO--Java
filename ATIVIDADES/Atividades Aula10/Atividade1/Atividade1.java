package Atividade1;
public class Atividade1 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        try {
            // Tenta acessar um índice que não existe (fora dos limites do array)
            System.out.println("Tentando acessar o índice 10...");
            int valor = numeros[10];
            System.out.println("Valor no índice 10: " + valor); // Esta linha não será executada
        } catch (ArrayIndexOutOfBoundsException e) {
            // Captura a exceção e informa o erro
            System.out.println("Erro: Você tentou acessar um índice inválido do array!");
            System.out.println("Detalhes da exceção: " + e.getMessage());
        }

        System.out.println("O programa continua a execução após o tratamento do erro.");
    }
}
