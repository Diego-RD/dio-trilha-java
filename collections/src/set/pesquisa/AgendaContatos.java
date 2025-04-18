package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos(){
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

  public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet){
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", 123445567);
    agendaContatos.adicionarContato("Camila", 123445567);
    agendaContatos.adicionarContato("Diego", 123444537);
    agendaContatos.adicionarContato("Camila Souza", 0);
    agendaContatos.adicionarContato("Camila Pires", 1111111111);
    agendaContatos.adicionarContato("Cam Fernandes", 11111111);

    agendaContatos.exibirContatos();

    System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Camila Souza", 22222222));
    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Cami"));


  }



}
