package main.set.OperacoesBasicas;
import java.util.Set;
import java.util.HashSet;


public class ConjuntoConvidados {
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    Convidado convidado = new Convidado(nome, codigoConvite);
    convidadoSet.add(convidado);
  }

  public void removerConvidado(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet){
      if(c.getCodigoConvite() == codigoConvite){
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int quantidadeConvidados() {
    return convidadoSet.size();
  }

  public void imprimirListaConvidados() {
      System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    conjuntoConvidados.adicionarConvidado("João", 1);
    conjuntoConvidados.adicionarConvidado("Maria", 2);
    conjuntoConvidados.adicionarConvidado("José", 3);
    conjuntoConvidados.adicionarConvidado("Ana", 4);
    conjuntoConvidados.adicionarConvidado("Pedro", 5);
    conjuntoConvidados.adicionarConvidado("Marta", 6);
    conjuntoConvidados.adicionarConvidado("Carlos", 7);
    conjuntoConvidados.adicionarConvidado("Sandra", 8);
    conjuntoConvidados.adicionarConvidado("Lucas", 9);
    conjuntoConvidados.adicionarConvidado("Paula", 10);
    conjuntoConvidados.removerConvidado(5);
    conjuntoConvidados.removerConvidado(1);
    conjuntoConvidados.imprimirListaConvidados();
    System.out.println("Quantidade de convidados: " + conjuntoConvidados.quantidadeConvidados());
    
  }
}

