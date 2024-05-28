package main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class Item {
  private List<CarrinhoDeCompras> carrinhoDeComprasList;

  public Item() {
    this.carrinhoDeComprasList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(nome, preco, quantidade);
    carrinhoDeComprasList.add(carrinhoDeCompras);
  }

  public void removerItem(String nome) {
    List<CarrinhoDeCompras> carrinhoDeComprasARemover = new ArrayList<>();

    for(CarrinhoDeCompras carrinhoDeCompras : carrinhoDeComprasList) {
      if(carrinhoDeCompras.getNome().equalsIgnoreCase(nome)) {
        carrinhoDeComprasARemover.add(carrinhoDeCompras);
      }
    }
    carrinhoDeComprasList.removeAll(carrinhoDeComprasARemover);
  }

  public int calcularValorTotal(){
    int valorTotal = 0;
    for(CarrinhoDeCompras carrinhoDeCompras : carrinhoDeComprasList) {
      valorTotal += carrinhoDeCompras.getPreco() * carrinhoDeCompras.getQuantidade();
    }
    System.out.println("Valor total: " + valorTotal);
    return valorTotal;
  }

  public void exibirItens(){
    System.out.println("Itens do carrinho: ");
    for(CarrinhoDeCompras carrinhoDeCompras : carrinhoDeComprasList) {
      System.out.println("Nome: " + carrinhoDeCompras.getNome() + " Preço: " + carrinhoDeCompras.getPreco() + " Quantidade: " + carrinhoDeCompras.getQuantidade());
    }
  }

  public static void main(String[] args) {
    Item item = new Item();
    item.adicionarItem("Camiseta", 50.0, 2);
    item.adicionarItem("Calça", 100.0, 1);
    item.adicionarItem("Tênis", 200.0, 1);
    item.removerItem("Calça");
    item.exibirItens();
    item.calcularValorTotal();
  }
}
