package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {

  private List<Item> listaItens;

  public CarinhoDeCompras() {
    this.listaItens = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    this.listaItens.add(item);
  }

  public void removerItem(String nome){
    List<Item> removerItem = new ArrayList<>();
    for(Item i : listaItens){
      if(i.getNome().equalsIgnoreCase(nome)){
        removerItem.add(i);
      }
    }
    listaItens.removeAll(removerItem);
  }

  public double calcularValorTotal(){
    double preco = 0d;
    for(Item i : listaItens){
        double precoCalcular = i.getPreco() * i.getQuantidade();
       preco += precoCalcular;
   }
    return preco;
  }

  public String exibirItens(){
    return listaItens.toString();
  }

  @Override
  public String toString() {
    return "CarinhoDeCompras{" +
            "listaItens=" + listaItens +
            '}';
  }

  public static void main(String[] args) {
    CarinhoDeCompras carinho = new CarinhoDeCompras();

    carinho.adicionarItem("Item 1",2.00,1);
    carinho.adicionarItem("Item 2",1.50,4);
    carinho.adicionarItem("Item 3",3.00,2);
    carinho.adicionarItem("Item 4",5.00,10);

    System.out.println(carinho.exibirItens());
    System.out.println("------------------");

    carinho.removerItem("item 4");
    //carinho.removerItem("item 3");
    System.out.println(carinho.exibirItens());
    System.out.println("------------------");
    System.out.println(carinho.calcularValorTotal());
  }

}
