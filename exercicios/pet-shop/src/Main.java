import java.util.Scanner;

public class Main {
  private final static Scanner scanner = new Scanner(System.in);
  private final static PetMachine petmachine = new PetMachine();

  public static void main(String[] args) {
    // permite que digite frases sem dar exeções como espaço no meio da entrada.
    scanner.useDelimiter("\\n");
    var opcao = -1;

    do {
      System.out.println("=== Escolha uma das opções: ====");
      System.out.println("1 - Dar banho no pet");
      System.out.println("2 - Abastecer maquina com água");
      System.out.println("3 -  Abastecer maquina com Shampoo");
      System.out.println("4 - Verificar agua:");
      System.out.println("5 - Verificar Shampoo  ");
      System.out.println("6 - Verificar se tem pet no banho ");
      System.out.println("7 - colocar pet na maquina ");
      System.out.println("8 - Retirar pet da maquina");
      System.out.println("9- Limpar a maquina");
      System.out.println("0 - Sair");
      System.out.print("> ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1 -> petmachine.darBanho();
        case 2 -> abastecerAgua();
        case 3 -> abastecerShampoo();
        case 4 -> verificarAgua();
        case 5 -> verificarShampoo();
        case 6 -> temPetNaMaquina();
        case 7 -> colocarPerNaMaquina();
        case 8 -> petmachine.retirarPet();
        case 9 -> petmachine.lavarMaquina();
        case 0 -> System.exit(0);
        default -> System.out.println("Escolha uma opção valida de 1 a 9.");
      }
    } while (true);
  }

  private static void abastecerAgua() {
    petmachine.adicionarAgua();
    System.out.println("Abastecendo Água maquina esta com " + petmachine.getAgua() + " litro(s) de Água");

  }

  private static void abastecerShampoo() {
    petmachine.adicionarShampoo();
    System.out.println("Abastecendo Shampoo maquina esta com " + petmachine.getShampoo() + " litro(s) de Shampoo");
  }

  private static void verificarAgua() {
    var quantia = petmachine.getAgua();
    System.out.println("A maquina esta no momento com " + quantia + " litro(s) de Água");
  }

  private static void verificarShampoo() {
    var quantia = petmachine.getShampoo();
    System.out.println("A maquina esta no momento com " + quantia + " litro(s) de shampoo");
  }

  private static void temPetNaMaquina() {
    var temPet = petmachine.temPet();
    System.out.println(temPet ? "Tem pet na maquina" : "Não tem pet na maquina");
  }

  public static void colocarPerNaMaquina() {
    var name = "";
    while (name == null || name.isEmpty()) {
      System.out.println("Informe o nome do pet:");
      name = scanner.next();
    }
    var pet = new Pet(name);
    petmachine.setPet(pet);
    System.out.println(" O pet " + pet.getName() + " foi colocado na maquina.");
  }

}