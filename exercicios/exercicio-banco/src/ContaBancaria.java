
import java.util.Scanner;

public class ContaBancaria {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    PessoaConta cliente = new PessoaConta();

    int opcao = 0;
    double saldo = 0;
    double chequeEspecial = 0;
    double saldoInicial = 0;


    System.out.println("\n Criação de conta");
    System.out.print("Informe seu nome: ");
    cliente.nome = terminal.next();
    System.out.print("Informe um CPF: ");
    cliente.cpf = terminal.next();
    cliente.verificarCpf();

    System.out.print("Informe qual sera o primeiro deposito da conta: ");
    saldoInicial = terminal.nextDouble();
    Conta conta = new Conta(saldoInicial);

    // usando while com switch para fazer o menu,no while a condiçao e no switch o parametro dos casos dentro do que for digitado pelo usuario.
    while (opcao !=7){
      mostrarMenu();
      opcao = terminal.nextInt();
      switch (opcao) {
        case 1 -> conta.consultarSaldo();
        case 2 -> conta.consultarChequeEspecial();
        case 3 -> conta.depositar();
        case 4 -> conta.sacar();
        case 5 -> conta.pagarBoleto();
        case 6 -> conta.verificarChequeEspecial();
        case 7 -> System.out.println("Obrigado por usar nosso banco");
        default -> System.out.println("Tente novamente");
      }
    }
  }
  static void mostrarMenu(){
    System.out.println("\nMenu:");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Consultar cheque especial");
    System.out.println("3 - Depositar dinheiro");
    System.out.println("4 - Sacar dinheiro");
    System.out.println("5 - Pagar boleto");
    System.out.println("6 - Verificar se está usando cheque especial");
    System.out.println("7 - Sair");
    System.out.print("> ");
  }
}