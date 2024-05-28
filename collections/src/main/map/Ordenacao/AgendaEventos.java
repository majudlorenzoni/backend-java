package main.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventoMap;

  public AgendaEventos() {
    this.eventoMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, Evento evento) {
    eventoMap.put(data, evento);
  }

  public void exibirEventos() {
    eventoMap.forEach((data, evento) -> System.out.println("Data: " + data + " - Evento: " + evento));
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();
    Evento evento1 = new Evento("Show", "Banda 1");
    Evento evento2 = new Evento("Teatro", "Peça 1");
    Evento evento3 = new Evento("Cinema", "Filme 1");
    agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 10), evento1);
    agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 11), evento2);
    agendaEventos.adicionarEvento(LocalDate.of(2021, 10, 12), evento3);
    agendaEventos.exibirEventos();
  }

  
}