package domain;

public non-sealed class Gerente extends Colaborador {
  
  private String login;
  
  private String senha;
  
  private double comisao;

  public Gerente(String name, String codigo, int idade, String endereco, double salario, String login, String senha, double comisao) {
    super(name, codigo, idade, endereco, salario);
    this.login = login;
    this.senha = senha;
    this.comisao = comisao;
  }

  public Gerente() {

  }

  @Override
  public String getCodigo(){
    return "MN " + this.codigo;
  }


  public String getLogin() {
	return login;
  }
  
  public void setLogin(String login) {
	this.login = login;
  }
  
  public String getSenha() {
	return senha;
  }
  
  public void setSenha(String senha) {
	this.senha = senha;
  }
  
  public double getComisao() {
	return comisao;
  }
  
  public void setComisao(double comisao) {
	this.comisao = comisao;
  }


  @Override
  public double calculoSalario() {
    return this.salario + this.comisao;
  }


}
