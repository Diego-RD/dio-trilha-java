package record;

public class Main {
  public static void main(String[] args) {
    var person = new Person("Diego", 11);
    //System.out.println(person);
    System.out.println(person.name());
    System.out.println(person.getInfo());

    // criamos uma nova instancia, timemos que chamar ela denovo com novos valores por que a instancia anterior pe IMUTAVEL como essa apartir de agora tambem é;
    //var newPerson = new Person(person.name(), 13);
    // System.out.println(newPerson);

  }
}
