package atividade3;

import java.util.ArrayList;
import java.util.List;

public class TesteProdutos {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 10.50, 2));
        produtos.add(new Produto("Feijao", 8.00, 3));
        produtos.add(new Produto("Carne", 50.00, 1));

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
