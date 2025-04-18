package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> tarefaList;

  //Construtor que quando criamos um ListaTarefa ja temos um ArrayList vazio dentro dele.
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>() ;
  }

  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefaList){
      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas(){
    return tarefaList.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    System.out.println("Numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 3");

    System.out.println("Numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("tarefa 3");

    System.out.println("Numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }

}
