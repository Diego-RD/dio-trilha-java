package set.operacaoBasica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite){
    convidadosSet.add(new Convidado(nome,codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoRemover = null;
    if (!convidadosSet.isEmpty()){
      for(Convidado c : convidadosSet){
        if(c.getCodigoConvite() == codigoConvite){
          convidadoRemover = c;
          break;
        }
      }
    }else {
      throw new RuntimeException("Lista de convidados esta vazia");
    }
    convidadosSet.remove(convidadoRemover);
  }

  public int contarConvidados(){
     return convidadosSet.size();
  }

  public void exibirConvidados(){
    System.out.println(convidadosSet);
  }

  public static void main(String[] args) {

    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados.");

    conjuntoConvidados.exibirConvidados();

  }




}


