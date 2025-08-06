package atividade3;

import java.util.ArrayList;

public class Pedido {
    String cliente;
    ArrayList<String> lista_pratos = new ArrayList<>();

    void exibirPedido() {
        System.out.println("Nome do cliente: " + cliente);
        System.out.println("Lista de pratos: " + lista_pratos);
    }
}
