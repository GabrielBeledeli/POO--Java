public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Maria Silva", 8500.0, "Financeiro");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Setor: " + gerente.getSetor());
	}
}
