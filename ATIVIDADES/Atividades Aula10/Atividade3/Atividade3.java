package Atividade3;
public class Atividade3 {

    /**
     * Divide dois inteiros.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     * @throws DivisaoPorZeroException se o divisor 'b' for zero.
     */
    public static double dividir(int a, int b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException("Erro: Tentativa de divisão por zero.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Teste 1: Divisão bem-sucedida
        try {
            double resultado1 = dividir(100, 5);
            System.out.println("Resultado de 100 / 5: " + resultado1);
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------------------");

        // Teste 2: Tentativa de divisão por zero
        try {
            double resultado2 = dividir(42, 0);
            System.out.println("Resultado de 42 / 0: " + resultado2); // Esta linha não será executada
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}


