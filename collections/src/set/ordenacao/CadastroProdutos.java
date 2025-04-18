package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtoPorPreco.addAll(produtoSet);
    return produtoPorPreco;
  }

  public Set<Produto> exibirProdutosPorCodigo(){
    Set<Produto> produtosPorCodigo = new TreeSet<>(new ComparadorPorCodigo());
    produtosPorCodigo.addAll(produtoSet);
    return produtosPorCodigo;
  }

  public static void main(String[] args) {

    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1L,"Produto 5", 15d, 4);
    cadastroProdutos.adicionarProduto(2L,"Produto 0", 20d, 10);
    cadastroProdutos.adicionarProduto(1L,"Produto 3", 10d, 5);
    cadastroProdutos.adicionarProduto(9L,"Produto 9", 2d, 1);


    System.out.println(cadastroProdutos.produtoSet);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    System.out.println(cadastroProdutos.exibirProdutosPorCodigo());

  }

}
