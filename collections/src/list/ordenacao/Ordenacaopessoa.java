package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacaopessoa {

  private List<Pessoa> pessoaList;

  public Ordenacaopessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
}

  public static void main(String[] args) {
    Ordenacaopessoa ordenacaopessoa = new Ordenacaopessoa();

    ordenacaopessoa.adicionarPessoa("Nome 4" , 20, 1.56);
    ordenacaopessoa.adicionarPessoa("Nome 2" , 30, 1.95);
    ordenacaopessoa.adicionarPessoa("Nome 3" , 19, 1.70);
    ordenacaopessoa.adicionarPessoa("Nome 1" , 21, 1.60);

    System.out.println(ordenacaopessoa.pessoaList);
    System.out.println("-------------------------");
    System.out.println(ordenacaopessoa.ordenarPorIdade());
    System.out.println(ordenacaopessoa.ordenarPorAltura());
    System.out.println("-------------------------");

    // Lista volta na ordem que foi adicionada...
    System.out.println(ordenacaopessoa.pessoaList);
  }

}
