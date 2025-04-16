package map.operacoesBasicas;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }


  public void adicionarContato(String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome){
    if(!agendaContatoMap.isEmpty()){
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos(){
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome){
    Integer numeroPorNome= null;
    if (!agendaContatoMap.isEmpty()){
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }



  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Maria", 1234567);
    agendaContatos.adicionarContato("Diego", 2222222);
    agendaContatos.adicionarContato("Camila", 2222222);
    agendaContatos.adicionarContato("Camila DIO", 11111111);
    agendaContatos.adicionarContato("Maria", 33333333);
    agendaContatos.adicionarContato("Diego Rodrigues", 1974567);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Diego");
    agendaContatos.exibirContatos();

    System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Camila DIO"));

  }

}
