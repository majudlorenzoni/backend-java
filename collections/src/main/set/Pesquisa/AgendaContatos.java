package main.set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, String numero) {
    Contato contato = new Contato(nome, numero);
    contatoSet.add(contato);
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for(Contato c : contatoSet){
      if(c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, String novoNumero){
    Contato contatoParaAtualizar = null;
    for(Contato c : contatoSet){
      if(c.getNome().equals(nome)){
        contatoParaAtualizar = c;
        break;
      }
    }
    if(contatoParaAtualizar != null){
      contatoSet.remove(contatoParaAtualizar);
      contatoParaAtualizar = new Contato(nome, novoNumero);
      contatoSet.add(contatoParaAtualizar);
    }
    return contatoParaAtualizar;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionarContato("João", "123456789");
    agendaContatos.adicionarContato("Maria", "987654321");
    agendaContatos.adicionarContato("José", "456789123");

    agendaContatos.exibirContatos();
    System.out.println("Pesquisa por nome: " + agendaContatos.pesquisarPorNome("Jo"));
    System.out.println("Atualização de número: " + agendaContatos.atualizarNumeroContato("Maria", "111111111"));
    agendaContatos.exibirContatos();
  }
}
