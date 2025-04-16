package map.ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    //Aqui temos que exibir a lista organizada de eventos por isso o treeMap vai ser usado sabemos que em HasMap a lista nao é ordenada, então passando eventosMap como parametro e temos LocalDate como chave ela ja sabe como organizar a lista sem precisar criar um metodo.
    Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventoTreeMap);
  }

  public void obterProximoEvento() {
//    Set<LocalDate> dateset = eventosMap.keySet();
//    Collection<Evento> values = eventosMap.values();
//    eventosMap.get();

    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        System.out.println("O próximo evento: " + entry.getValue() + " acontecera na data: " + entry.getKey());
        break;
      }
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 10),"Evento 1", "Atração 1");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 10),"Evento 2", "Atração 2");
    agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 10),"Evento 3", "Atração 3");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 17),"Evento 4", "Atração 4");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 15),"Evento 5", "Atração 5");

    agendaEventos.exibirAgenda();

    agendaEventos.obterProximoEvento();

  }

}
