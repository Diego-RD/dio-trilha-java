import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    List<User> users = List.of(new User("Maria", 32), new User("Joao",19), new User("Manoel", 39), new User("Jose", 60));
    //Expressão lambda.
   //users.forEach(user -> System.out.println(users));

    imprimirStringValores(Record::toString, users);


  }
  private static void imprimirStringValores(Function<User, String> callback, List<User> users){
    users.forEach(u ->System.out.println(callback.apply(u)));

  }

}