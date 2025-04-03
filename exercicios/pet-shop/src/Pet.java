public class Pet {
  private final String name;

  private boolean limpo;
  //construtor
  public Pet(String name) {
    this.name = name;
    this.limpo = false;
  }

  public String getName() {
    return name;
  }

  public boolean estaLimpo() {
    return limpo;
  }
  public void setLimpo(boolean limpo) {
    this.limpo = limpo;
  }
}
