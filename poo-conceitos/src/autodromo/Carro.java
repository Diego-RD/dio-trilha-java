package autodromo;

public class Carro extends Veiculo {



  // inves de colocar todas as classes public e chamar no metodo main
  // fazemos o encapsulamento colocando private e chamando dentro do metodo ligar
  public void ligar(){
    confereCombustivel();
    confereCambio();
    System.out.println("autodromo.Carro ligado");
  }
  private void confereCombustivel(){
    System.out.println("Conferindo combustivel");
  }
  private void confereCambio(){
    System.out.println("Conferindo cambio em P");
  }


}
