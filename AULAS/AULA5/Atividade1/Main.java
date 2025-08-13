public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto(); // Construtor vazio
		Produto p2 = new Produto("Caneta", 2.5); // Preço válido
		Produto p3 = new Produto("Lápis", -1.0); // Preço inválido

		// Exibe os resultados
	System.out.println("Produto 1: nome = " + p1.getNome() + ", preço = " + p1.getPreco());
	System.out.println("Produto 2: nome = " + p2.getNome() + ", preço = " + p2.getPreco());
	System.out.println("Produto 3: nome = " + p3.getNome() + ", preço = " + p3.getPreco());
	}
}
