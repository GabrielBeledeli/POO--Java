public class Pedido {
    private int id;
    private StatusPedido status;
    private boolean pagamentoAprovado;

    public Pedido(int id, boolean pagamentoAprovado) {
        this.id = id;
        this.status = StatusPedido.NOVO;
        this.pagamentoAprovado = pagamentoAprovado;
    }

    public String verificarDisponibilidadeParaEnvio() {
        if (this.status != StatusPedido.PROCESSANDO) {
            return "Pedido não pode ser enviado: status é " + this.status;
        }
        if (!this.pagamentoAprovado) {
            return "Pedido não pode ser enviado: pagamento pendente.";
        }

        return "Pedido pode ser enviado.";
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}
