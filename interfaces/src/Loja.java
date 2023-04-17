public class Loja {
    public static void main(String[] args) {
        // Criando o carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeComprasImpl();

        // Criando produtos
        Vendavel produto1 = new Produto("Camiseta", 29.99);
        Vendavel produto2 = new Produto("Calça Jeans", 99.99);
        Vendavel produto3 = new Produto("Tênis", 149.99);

        // Adicionando produtos ao carrinho de compras
        carrinhoDeCompras.adicionarVendavel(produto1);
        carrinhoDeCompras.adicionarVendavel(produto2);
        carrinhoDeCompras.adicionarVendavel(produto3);

        // Exibindo o preço total dos produtos no carrinho de compras
        System.out.println("Total do carrinho de compras: R$" + carrinhoDeCompras.getTotal());
    }
}
