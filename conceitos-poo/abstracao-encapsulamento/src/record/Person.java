package record;

public record Person(String name, int age) {
  // contrutor compacto
  public Person {

  }
// construtoor secundario
  public Person(String name) {
    this(name, 1);
  }

  //Metodo
  public String getInfo(){
    return "Name " + name + " age " + age;
 }
}
