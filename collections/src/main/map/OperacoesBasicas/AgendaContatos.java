package main.map.OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if(!agendaContatoMap.isEmpty()){
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    agendaContatoMap.forEach((nome, telefone) -> System.out.println("Nome: " + nome + " - Telefone: " + telefone));
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if(!agendaContatoMap.isEmpty()){
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("José", 456789123);
    agendaContatos.exibirContatos();
    System.out.println("Pesquisando por Maria: " + agendaContatos.pesquisarPorNome("Maria"));
    agendaContatos.removerContato("Maria");
    agendaContatos.exibirContatos();
  }
}
