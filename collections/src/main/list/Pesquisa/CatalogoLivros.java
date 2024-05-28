package main.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
  private List<Livro> livroList;

  public CatalogoLivros(){
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    Livro livro = new Livro(titulo, autor, anoPublicacao);
    this.livroList.add(livro);
  }

  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro livro : livroList){
        if(livro.getAutor().equals(autor)){
          livrosPorAutor.add(livro);
        }
      }
    }
    System.out.println("Livros por autor: " + livrosPorAutor);
    return livrosPorAutor; // Adicionando o retorno correto
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro livro : livroList){
        if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
          livrosPorIntervaloAnos.add(livro);
        }
      }
    }
    System.out.println("Livros por intervalo de anos: " + livrosPorIntervaloAnos);
    return livrosPorIntervaloAnos; // Adicionando o retorno correto
  }

  public List<Livro> pesquisarPorTitulo(String titulo){
    List<Livro> livrosPorTitulo = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro livro : livroList){
        if(livro.getTitulo().equals(titulo)){
          livrosPorTitulo.add(livro);
        }
      }
    }
    System.out.println("Livros por titulo: " + livrosPorTitulo);
    return livrosPorTitulo; // Adicionando o retorno correto
  }

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros(); // Criação de instância do catalogo
    catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
    catalogo.adicionarLivro("O Silmarillion", "J.R.R. Tolkien", 1977);
    catalogo.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
    
    catalogo.pesquisarPorAutor("J.R.R. Tolkien");
    catalogo.pesquisarPorIntervaloAnos(1950, 1970);  
    catalogo.pesquisarPorTitulo("O Código Da Vinci");
  }
}
