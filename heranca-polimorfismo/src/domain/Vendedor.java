package domain;

public non-sealed class Vendedor extends Colaborador {

  private double valorVendido;

  private double porcetagemVenda;

  public Vendedor(String name, String codigo, int idade, String endereco, double salario, double porcetagemVenda, double valorVendido) {
    super(name, codigo, idade, endereco, salario);
    this.porcetagemVenda = porcetagemVenda;
    this.valorVendido = valorVendido;
  }

  public Vendedor(){

  }
  @Override
  public String getCodigo(){
    // Aqui usamos super para poder acessar um metodo da classe pai.
    return "SL " + this.codigo;
  }



  public double getPorcentagemVenda() {
	return porcetagemVenda;
  }

  public void setPorcentagemVenda(double porcetagemVenda) {
	this.porcetagemVenda = porcetagemVenda;
  }

  public double getValorVendido() {
    return valorVendido;
  }

  public void setValorVendido(double valorVendido) {
    this.valorVendido = valorVendido;
  }

  @Override
  public double calculoSalario() {
    return this.salario + (valorVendido * porcetagemVenda ) / 100;
  }
}



