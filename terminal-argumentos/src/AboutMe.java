import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  
  public static void main(String[] args) {
    // criando um Objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite sua nome: ");
    String nome =scanner.next();

    System.out.println("Digite sua sobrenome: ");
    String sobrenome =scanner.next();

    System.out.println("Digite sua idade: ");
    int idade=scanner.nextInt();

    System.out.println("Digite sua altura: ");
    double altura =scanner.nextDouble();

    // Imprimindo os dados obtidos pelo usuario
    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");


    /**  Exemplo do primeiro codigo sem Scanner
     
    String nome = args [0];
    String sobrenome = args [1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
    */

  }
}
