package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {


  private Map<Long, Produtos> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produtos(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double estoqueTotal = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produtos p : estoqueProdutosMap.values()) {
        estoqueTotal += p.getPreco() * p.getQuantidade();
      }
    }
    return estoqueTotal;
  }

  public Produtos obterProdutoMaisCaro() {
    Produtos produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produtos p : estoqueProdutosMap.values()) {
        if (p.getPreco() > maiorPreco) {
          produtoMaisCaro = p;
          maiorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisCaro;
  }

  public Produtos obterProdutoMaisBarato() {
    Produtos produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produtos p : estoqueProdutosMap.values()) {
        if (p.getPreco() < menorPreco) {
          produtoMaisBarato = p;
          menorPreco = p.getPreco();
        }
      }
    }
    return produtoMaisBarato;
  }

  public Produtos obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produtos produtoMaiorQuantidadeValorTotalNoEstoque = null;
    double valorMaiorProduto = 0d;
    if(!estoqueProdutosMap.isEmpty()){
      for (Map.Entry<Long,Produtos> entry : estoqueProdutosMap.entrySet()){
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if(valorProdutoEmEstoque > valorMaiorProduto){
          valorMaiorProduto = valorProdutoEmEstoque;        }
           produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
      }
    }
    return produtoMaiorQuantidadeValorTotalNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

    estoqueProdutos.exibirProdutos();

    estoqueProdutos.adicionarProduto(1L, "Produto A", 1, 1.50);
    estoqueProdutos.adicionarProduto(2L, "Produto B", 2, 2.50);
    estoqueProdutos.adicionarProduto(5L, "Produto F", 1, 20);
    estoqueProdutos.adicionarProduto(3L, "Produto C", 10, 1);


    estoqueProdutos.exibirProdutos();

    System.out.println("Valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());
    System.out.println("Produto Mais caro é: " + estoqueProdutos.obterProdutoMaisCaro()
    );
    System.out.println("Produto Mais barato é: " + estoqueProdutos.obterProdutoMaisBarato());

    System.out.println("Maior produto em valor de estoque é: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }

}
