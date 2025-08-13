	public class Produto {
	private String nome;
	private double preco;

	// Construtor vazio
	public Produto() {
		this.nome = "";
		this.preco = 0.0;
	}

	// Construtor com parâmetros
	public Produto(String nome, double preco) {
		this.nome = nome;
		if (preco < 0.0) {
			this.preco = 0.0;
			System.out.println("Preço inválido!");
		} else {
			this.preco = preco;
		}
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}
}
