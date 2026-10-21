public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void reporEstoque(int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void venderProduto(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque = quantidadeEstoque - quantidade;
        } else {
            System.out.println("Erro: quantidade insuficiente em estoque.");
        }
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
    }
}
