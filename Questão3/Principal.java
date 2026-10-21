public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado", 150.00, 10);

        produto.reporEstoque(5);
        produto.venderProduto(3);

        produto.exibirProduto();
    }
}
