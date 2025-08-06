package atividade3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "João";

        Prato prato1 = new Prato();
        prato1.nome = "Feijoada";
        prato1.preco = 35.0f;

        Prato prato2 = new Prato();
        prato2.nome = "Moqueca";
        prato2.preco = 45.0f;

        Pedido pedido = new Pedido();
        pedido.cliente = cliente.nome;
        pedido.lista_pratos.add(prato1.nome);
        pedido.lista_pratos.add(prato2.nome);

        cliente.exibirNome();
        prato1.exibirPrato();
        prato2.exibirPrato();
        pedido.exibirPedido();
    }

}
