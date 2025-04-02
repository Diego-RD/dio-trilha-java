import java.util.Scanner;

public class PessoaConta {

  Scanner terminal = new Scanner(System.in);
  protected String nome;
  protected String cpf;


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void verificarCpf(){
    while (cpf.length() < 7){
      System.out.println("Esse cpf é invalido tente novamente com um cpf valido;");
      cpf = terminal.next();
    }
  }
}
