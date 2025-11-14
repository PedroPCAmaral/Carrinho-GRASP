public class CarrinhoController {

    private CarrinhoDeCompras carrinho;

    public CarrinhoController() {
        this.carrinho = new CarrinhoDeCompras();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        carrinho.adicionarItem(produto, quantidade);
    }

    public void exibirCarrinho() {
        System.out.println("==== Itens no Carrinho ====");
        for (ItemPedido item : carrinho.getItens()) {
            System.out.println(item.getProduto().getNome() + 
                " | Qtd: " + item.getQuantidade() + 
                " | Subtotal: R$ " + item.getSubtotal());
        }

        System.out.println("===========================");
        System.out.println("Total da compra: R$ " + carrinho.calcularTotal());
    }
}
