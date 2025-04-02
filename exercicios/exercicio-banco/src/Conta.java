import java.util.Scanner;

public class Conta {
  Scanner terminal = new Scanner(System.in);

  private double saldo = 0;
  private double chequeEspecial = 0;
  private double saldoInicial = 0;
  private double chequeEspecialInicial = 0;

  public Conta (double saldoInicial){
    this.saldo = saldoInicial;
      if (saldoInicial <= 500 && saldoInicial > 0) {
        this.chequeEspecial = saldoInicial * 0.10;
      } else {
        this.chequeEspecial = saldoInicial * 0.50;
      }
      this.chequeEspecialInicial = chequeEspecial;
  }
  public void consultarSaldo(){
    System.out.println("Seu Saldo é de :" + saldo);
  }
  public void consultarChequeEspecial (){
    System.out.println("Seu cheque especial é de : " + chequeEspecial);
  }
  public void depositar (){
    System.out.print("Informe o valor do depósito: ");
    double deposito = terminal.nextDouble();

    if (deposito > 0) {
      double faltaCobrir = chequeEspecialInicial - chequeEspecial;

      if (faltaCobrir > 0) {
        if (deposito >= faltaCobrir) {
          chequeEspecial += faltaCobrir;
          deposito -= faltaCobrir;
        } else {
          chequeEspecial += deposito;
          deposito = 0;
        }
      }

      saldo += deposito;
      System.out.println("Depósito realizado com sucesso!");
      consultarSaldo();
      consultarChequeEspecial();
    } else {
      System.out.println("O valor do depósito deve ser positivo.");
    }
  }
  public void sacar(){
    System.out.print("Informe o valor para saque: ");
    double valorSaque = terminal.nextDouble();

    if (valorSaque > 0 && valorSaque <= saldo) {
      saldo -= valorSaque;
    } else if (valorSaque > saldo && valorSaque <= saldo + chequeEspecial) {
      double falta = valorSaque - saldo;
      saldo = 0;
      chequeEspecial -= falta;
    } else {
      System.out.println("Saldo insuficiente para saque, seu saldo é: " + saldo);
      return;
    }
    System.out.println("Saque realizado com sucesso!");
    consultarSaldo();
    consultarChequeEspecial();
  }
  public void pagarBoleto(){
    System.out.print("Informe o valor do boleto: ");
    double valorBoleto = terminal.nextDouble();

    if (valorBoleto > 0 && valorBoleto <= saldo) {
      saldo -= valorBoleto;
    } else if (valorBoleto > saldo && valorBoleto <= saldo + chequeEspecial) {
      double falta = valorBoleto - saldo;
      saldo = 0;
      chequeEspecial -= falta;
    } else {
      System.out.println("Saldo insuficiente para pagamento.");
      return;
    }

    System.out.println("Boleto pago com sucesso!");
    consultarSaldo();
    consultarChequeEspecial();
  }
  public void verificarChequeEspecial(){
    if (chequeEspecial < chequeEspecialInicial) {
      System.out.println("Você está utilizando o cheque especial.");
      System.out.println("Limite inicial: R$" + chequeEspecialInicial);
      System.out.println("Limite atual: R$" + chequeEspecial);
    } else {
      System.out.println("Você não está usando o cheque especial.");
      System.out.println("Limite disponível: R$" + chequeEspecial);
    }
  }

}
