public class PetMachine {

  private boolean limpo = true;
  private int agua = 30;
  private int shampoo = 10;
  private Pet pet;



  public void darBanho(){
    if(this.pet == null){
      System.out.println("Não tem pet na maquina");
      return;
    }
    this.agua -= 10;
    this.shampoo -= 2;
    pet.setLimpo(true);
    System.out.println("O pet "+ pet.getName() + " esta limpo");
  }
  public void adicionarAgua(){
    if(agua == 30){
      System.out.println("A capacidade de agua esta no máximo");
      return;
    }
    agua += 2;
  }

  public void adicionarShampoo(){
    if(shampoo == 10){
      System.out.println("A capacidade de Shampoo esta no máximo");
      return;
    }
    shampoo += 2;

  }

  public int getAgua() {
    return agua;
  }

  public int getShampoo() {
    return shampoo;
  }
  public boolean temPet(){
    return pet != null;
  }

  public void setPet(Pet pet) {
    if(!this.limpo){
      System.out.println("A maquina estas suja , para colocar pet é necessário limpa-la.");
      return;
    }
    if(temPet()){
      System.out.println("O pet " + this.pet.getName() + " Esta na maquina");
      return;
    }
    this.pet = pet;
  }
  public void retirarPet(){
    this.limpo = this.pet.estaLimpo();
    System.out.println("O pet " + this.pet.getName()+ "  pet esta limpo");
    this.pet = null;
  }
  public void lavarMaquina(){
    this.agua -= 3;
    this.shampoo -= 1;
    this.limpo = true;
    System.out.println("Maquina foi limpa");
  }
}
