package atividade7;

public class Main {
    public static void main(String[] args) {
        Quarto quarto = new Quarto();
        quarto.numero = 101;
        quarto.tipo = "Solteiro";
        quarto.status = "Disponível";
        quarto.exibirQuarto();

        Hospede hospede = new Hospede();
        hospede.nome = "João Silva";
        hospede.cpf_cnpj = "123.456.789-00";
        hospede.exibirHospede();

        Reserva reserva = new Reserva();
        reserva.quarto = quarto;
        reserva.hospede = hospede;
        reserva.data_entrada = "2023-08-15";
        reserva.data_saida = "2023-08-20";
        reserva.exibirReserva();
    }
}
