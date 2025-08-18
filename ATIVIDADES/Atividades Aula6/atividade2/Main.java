package atividade2;

public class Main {
	public static void main(String[] args) {
		Retangulo ret = new Retangulo("Azul", true, 5.0, 3.0);
		Circulo circ = new Circulo("Vermelho", false, 2.0);

		System.out.println("Área do Retângulo: " + ret.calcularArea());
		System.out.println("Área do Círculo: " + circ.calcularArea());
	}
}
