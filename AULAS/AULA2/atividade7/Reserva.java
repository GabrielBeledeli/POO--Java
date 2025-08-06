package atividade7;

public class Reserva {
    Quarto quarto;
    Hospede hospede;
    String data_entrada;
    String data_saida;

    void exibirReserva() {
        System.out.println("Informações da Reserva");
        System.out.println("Quarto: " + quarto.numero);
        System.out.println("Hospede: " + hospede.nome);
        System.out.println("Data de Entrada: " + data_entrada);
        System.out.println("Data de Saída: " + data_saida);
    }
}
