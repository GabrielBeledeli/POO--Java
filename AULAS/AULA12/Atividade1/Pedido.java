public class Pedido {
    private int id;
    private StatusPedido status;

    public Pedido(int id) {
        this.id = id;
        this.status = StatusPedido.NOVO;
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