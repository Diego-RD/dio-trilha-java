package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {

  private List<Integer> numeroList;

  public OrdenacaoNumero() {
    this.numeroList = new ArrayList<>();
  }

  public void adicionarNumero(int numero){
    numeroList.add(numero);
  }


  public List<Integer> ordenarAscendente(){
    List<Integer> ordenarAscendente = new ArrayList<>(numeroList);
    if(!numeroList.isEmpty()){
      Collections.sort(ordenarAscendente);
      return ordenarAscendente;
    }else {
      throw new RuntimeException("Lista  de números vazia");
    }
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> ordenarDecrecente = new ArrayList<>(numeroList);
    if (!numeroList.isEmpty()) {
      // aqui passamos um comparador primeiro que seria a nova lista , ai no parametro sort passamos collections com o methodo resverseOrder() para ai sim inverter a ordem.
      ordenarDecrecente.sort(Collections.reverseOrder());
      return ordenarDecrecente;
    } else {
      throw new RuntimeException("Lista  de números vazia");
    }
  }



  public static void main(String[] args) {
    OrdenacaoNumero numero = new OrdenacaoNumero();

    numero.adicionarNumero(10);
    numero.adicionarNumero(12);
    numero.adicionarNumero(1);
    numero.adicionarNumero(8);
    numero.adicionarNumero(5);
    numero.adicionarNumero(20);

    System.out.println(numero);
    System.out.println("-------------");
    System.out.println(numero.ordenarAscendente());;
    System.out.println("-------------");
    System.out.println(numero.ordenarDescendente());



  }



}
