package Atividade4;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Arroz", 2, 5.50);
        pedido.adicionarItem("Feijão", 1, 7.00);
        pedido.adicionarItem("Macarrão", 3, 4.00);

        pedido.removerItem("Feijão");

        System.out.println("Valor total do pedido: R$ " + pedido.valorTotal());
    }
}
