package Atividade4;

import java.util.ArrayList;
import java.util.List;

class ItemPedido {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getTotal() {
        return quantidade * precoUnitario;
    }
}

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String produto, int quantidade, double precoUnitario) {
        itens.add(new ItemPedido(produto, quantidade, precoUnitario));
    }

    public void removerItem(String produto) {
        itens.removeIf(item -> item.getProduto().equalsIgnoreCase(produto));
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getTotal();
        }
        return total;
    }
}
