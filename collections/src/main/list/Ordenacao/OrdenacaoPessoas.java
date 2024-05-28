package main.list.Ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas(){
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    Pessoa pessoa = new Pessoa(nome, idade, altura);
    this.pessoaList.add(pessoa);
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    System.out.println(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    System.out.println(pessoasPorAltura);
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas catalogo = new OrdenacaoPessoas();

    catalogo.adicionarPessoa("Maria", 25, 1.70);
    catalogo.adicionarPessoa("João", 30, 1.80);
    catalogo.adicionarPessoa("Ana", 20, 1.60);

    System.out.println("\nPessoas depois de ordenar por idade:");
    catalogo.ordenarPorIdade();
    
    System.out.println("\nPessoas depois de ordenar por altura:");
    catalogo.ordenarPorAltura();
  }
}