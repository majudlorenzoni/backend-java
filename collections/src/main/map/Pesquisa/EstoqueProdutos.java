package main.map.Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(Long codigo, Produto produto) {
    estoqueProdutosMap.put(codigo, produto);
  }

  public void exibirProdutos() {
    estoqueProdutosMap.forEach((codigo, produto) -> System.out.println("Código: " + codigo + " - Nome: " + produto.getNome() + " - Preço: " + produto.getPreco() + " - Quantidade: " + produto.getQuantidade()));
  }

  public double calcularValorTotalEstoque(){
    double valorTotalEstoque = 0;
    for (Produto produto : estoqueProdutosMap.values()) {
      valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
      System.out.println(produto.getNome() + " " + produto.getPreco() + " " + produto.getQuantidade() + " " + produto.getPreco() * produto.getQuantidade());
    }
    return valorTotalEstoque;
  }

  public Produto produtoMaisCaro(){
    Produto produtoMaisCaro = null;
    double precoProdutoMaisCaro = 0;
    for (Produto produto : estoqueProdutosMap.values()) {
      if(produto.getPreco() > precoProdutoMaisCaro){
        precoProdutoMaisCaro = produto.getPreco();
        produtoMaisCaro = produto;
        System.out.println(produtoMaisCaro.getNome() + " " + produtoMaisCaro.getPreco() + " " + produtoMaisCaro.getQuantidade());
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
    Produto produto1 = new Produto("Arroz", 10.0, 5);
    Produto produto2 = new Produto("Feijão", 5.0, 10);
    Produto produto3 = new Produto("Macarrão", 3.0, 20);
    estoqueProdutos.adicionarProduto(1L, produto1);
    estoqueProdutos.adicionarProduto(2L, produto2);
    estoqueProdutos.adicionarProduto(3L, produto3);
    estoqueProdutos.exibirProdutos();
    System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoqueProdutos.produtoMaisCaro().getNome());
  }
}

