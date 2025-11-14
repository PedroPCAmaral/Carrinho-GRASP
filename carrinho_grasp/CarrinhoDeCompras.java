import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<ItemPedido> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
