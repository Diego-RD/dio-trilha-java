package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumerosFavoritos {

  private List<Integer> numeroList = new ArrayList<>(List.of(42, 7, 19, 3, 88));


public List<Integer> ordenarCrescente(){
  List<Integer> ordenarCrescente = new ArrayList<>(numeroList);
  if(!numeroList.isEmpty()){
    Collections.sort(ordenarCrescente);
    return ordenarCrescente;
  }else {
    throw new RuntimeException("Erro");
  }
}

public List<Integer> ordenarDecrecente(){
  List<Integer> ordenarDecrecente = new ArrayList<>(numeroList);
  if(!numeroList.isEmpty()){
    ordenarDecrecente.sort(Collections.reverseOrder());
    return ordenarDecrecente;
  }else {
    throw new RuntimeException("Erro");
  }
}

  public static void main(String[] args) {

  NumerosFavoritos rodar = new NumerosFavoritos();

    System.out.println(rodar.numeroList);
    System.out.println(rodar.ordenarCrescente());
    System.out.println(rodar.ordenarDecrecente());

  }




}
