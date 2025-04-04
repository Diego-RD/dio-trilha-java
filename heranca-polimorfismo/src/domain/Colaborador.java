package domain;

public  sealed abstract class Colaborador permits Gerente, Vendedor {
  
  protected String name;
  
  protected String codigo;
  
  protected int idade;
  
  protected String endereco;
  
  protected double salario;

  public Colaborador(String name, String codigo, int idade, String endereco, double salario) {
    this.name = name;
    this.codigo = codigo;
    this.idade = idade;
    this.endereco = endereco;
    this.salario = salario;
  }

 public Colaborador(){

 }


  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  public String getCodigo() {
	return codigo;
  }
  
  public void setCodigo(String codigo) {
	this.codigo = codigo;
  }
  
  public int getIdade() {
	return idade;
  }
  
  public void setIdade(int idade) {
	this.idade = idade;
  }
  
  public String getEndereco() {
	return endereco;
  }
  
  public void setEndereco(String endereco) {
	this.endereco = endereco;
  }
  
  public double getSalario() {
	return salario;
  }
  
  public void setSalario(double salario) {
	this.salario = salario;
  }

  public abstract double calculoSalario();

  public double calcularSalario (double extra){
    return this.calculoSalario() + extra;
  }

}
