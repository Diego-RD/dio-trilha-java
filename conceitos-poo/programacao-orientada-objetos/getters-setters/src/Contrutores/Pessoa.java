package Contrutores;

public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;

  //Método contrutor , aqui eu digo que quando criar uma pessoa devo informar o cpf e nome da pessoa criada.(semelhante ao metodo set)
  public Pessoa(String cpf, String nome) {
    // 
    this.cpf = cpf;
    this.nome = nome;
  }
  
  public Pessoa(String endereco) {
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
  // ...
  // setters de nome e cpf ?
}
