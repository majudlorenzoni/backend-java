package main.set.Ordenacao;

import java.util.Set;
import java.util.TreeSet;

import main.set.Ordenacao.Produto.ComparatorPorPreco;

public class CadastroProdutos {
  private Set<Produto> produtoSet;

  public CadastroProdutos(Set<Produto> produtoSet) {
    this.produtoSet = produtoSet;
  }

  public void adicionarProduto(Produto produto) {
    produtoSet.add(produto);
  }

    public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>();
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    Set<Produto> produtos = new TreeSet<>();
    CadastroProdutos cadastroProdutos = new CadastroProdutos(produtos);

    cadastroProdutos.adicionarProduto(new Produto(1, "Amaciante", 24.0, 1));
    cadastroProdutos.adicionarProduto(new Produto(2, "Torrada", 20.0, 10));
    cadastroProdutos.adicionarProduto(new Produto(3, "Maionese", 3.0, 1));
    cadastroProdutos.adicionarProduto(new Produto(4, "Produto 4", 40.0, 20));
    cadastroProdutos.adicionarProduto(new Produto(5, "Produto 5", 50.0, 25));

    System.out.println("Produtos por nome: ");
    cadastroProdutos.exibirProdutosPorNome().forEach(System.out::println);

    System.out.println("Produtos por preço: ");
    cadastroProdutos.exibirProdutosPorPreco().forEach(System.out::println);
  }
}
