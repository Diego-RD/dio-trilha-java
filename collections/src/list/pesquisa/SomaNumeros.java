package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

  private List<Integer> numero;

  public SomaNumeros() {
    this.numero = new ArrayList<>();
  }

  public void adicionarNumero(int numero){
    this.numero.add(numero);
  }

public int calcularSoma(){
    int valorTotal = 0;
    for(Integer i : numero){
      int soma = i;
      valorTotal += soma;
    }
    return valorTotal;
}

public int encontrarMaiorNumero(){
    // Aqui com Integer.MIN_VALUE assume o menor valor de número inteiro.
  int maiorNumero = Integer.MIN_VALUE;
    if(!numero.isEmpty()){
      for(Integer n : numero){
        if(n >= maiorNumero){
          maiorNumero = n;
        }
      }
    }else {
      throw new RuntimeException("Lista vazia");
    }
    return maiorNumero;
}

public int encontrarMenorNumero(){
  int menorNumero = Integer.MAX_VALUE;
  if(!numero.isEmpty()){
    for(Integer n : numero){
      if(n <= menorNumero){
        menorNumero = n;
      }
    }
  }else {
    throw new RuntimeException("Lista vazia");
  }
  return menorNumero;
}

public void exibirNumeros(){
    if(!numero.isEmpty()){
      System.out.println(this.numero);
  }else{
      throw new RuntimeException("Lista vazia");
    }
}



  public static void main(String[] args) {
    SomaNumeros numero = new SomaNumeros();

    numero.adicionarNumero(35);
    numero.adicionarNumero(-2);
    numero.adicionarNumero(20);
    numero.adicionarNumero(5);
    numero.adicionarNumero(7);

    System.out.println(numero.calcularSoma());
    System.out.println("------------------");

    System.out.println(numero.encontrarMaiorNumero());
    System.out.println("------------------");
    System.out.println(numero.encontrarMenorNumero());
    System.out.println("------------------");

    numero.exibirNumeros();

  }

}
