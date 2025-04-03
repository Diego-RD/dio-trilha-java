public non-sealed class Gerente extends Colaborador {
  
  private String login;
  
  private String senha;
  
  private double comisao;
  
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
}
