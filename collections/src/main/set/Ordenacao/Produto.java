package main.set.Ordenacao;

public class Produto implements Comparable<Produto> {
  private long cod;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long cod, String nome, double preco, int quantidade) {
    this.cod = cod;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto produto) {
    return this.nome.compareToIgnoreCase(produto.nome);
  }


  public long getCod() {
    return cod;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Produto produto = (Produto) o;
    return cod == produto.cod;
  }

  @Override
  public String toString() {
    return "Produto{" +
            "cod=" + cod +
            ", nome='" + nome + '\'' +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            '}';
  }

  class ComparatorPorPreco implements Comparable<Produto> {
    @Override
    public int compareTo(Produto produto) {
      return Double.compare(preco, produto.preco);
    }
  }
  
}
