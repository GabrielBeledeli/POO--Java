package atividade2;

public class TesteVeiculos {

    public static void fazerMover(Veiculo veiculo) {
        veiculo.mover();
    }

    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaBicicleta = new Bicicleta();

        fazerMover(meuCarro);
        fazerMover(minhaBicicleta);
    }
}
