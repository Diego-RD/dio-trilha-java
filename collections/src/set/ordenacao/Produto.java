package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

  private String nome;
  private long cod;
  private double preco;
  private int quantidade;

  public Produto(long cod, String nome, double preco, int quatidade) {
    this.nome = nome;
    this.cod = cod;
    this.preco = preco;
    this.quantidade = quatidade;
  }

  @Override
  public int compareTo(Produto p) {
    return nome.compareToIgnoreCase(p.getNome());
  }

  public String getNome() {
    return nome;
  }

  public long getCod() {
    return cod;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Produto produto)) return false;
    return getCod() == produto.getCod();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getCod());
  }

  @Override
  public String toString() {
    return "Produto{" +
            "nome='" + nome + '\'' +
            ", cod=" + cod +
            ", preco=" + preco +
            ", quantidade=" + quantidade +
            '}';
  }

}

class ComparatorPorPreco implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}

class ComparadorPorCodigo implements Comparator<Produto>{

  @Override
  public int compare(Produto p1, Produto p2) {
    return Long.compare(p1.getCod(),p2.getCod());
  }
}