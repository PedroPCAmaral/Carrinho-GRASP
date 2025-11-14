public class Main {
    public static void main(String[] args) {
        CarrinhoController controller = new CarrinhoController();

        Produto p1 = new Produto("Mouse Gamer", 150.0);
        Produto p2 = new Produto("Teclado Mecânico", 320.0);
        Produto p3 = new Produto("Monitor 24"", 900.0);

        controller.adicionarProduto(p1, 2);
        controller.adicionarProduto(p2, 1);
        controller.adicionarProduto(p3, 1);

        controller.exibirCarrinho();
    }
}
