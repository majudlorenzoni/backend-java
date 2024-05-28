package main.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefas> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    Tarefas tarefa = new Tarefas(descricao);
    tarefaList.add(tarefa);
  }

  public void removerTarefa (String descricao) {
    List<Tarefas> tarefasARemover = new ArrayList<>();

    for (Tarefas tarefa : tarefaList) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasARemover.add(tarefa);
      }
    }

    tarefaList.removeAll(tarefasARemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size(); 
  }

  public void obterDescricoesTarefas() {
    System.out.println("Descrição das tarefas: ");
    for (Tarefas tarefa : tarefaList) {
      System.out.println(tarefa.getDescricao());
  }
  }
  
  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    listaTarefa.adicionarTarefa("Estudar Java");
    listaTarefa.adicionarTarefa("Estudar Python");
    listaTarefa.adicionarTarefa("Estudar JavaScript");
    listaTarefa.removerTarefa("Estudar Python");
    System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
    listaTarefa.obterDescricoesTarefas();
  }
}




