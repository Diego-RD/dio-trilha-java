package enums;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo",11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 19),
	PIAUI ("PI", "Piauí", 12),
	MARANHAO ("MA","Maranhão", 55), 
	CEARA("CE", "CEARA", 21)
	;
	
	private String nome;
	private String sigla;
	private int ibje;
	//Construtor
	private EstadoBrasileiro(String sigla, String nome, int ibje) {
		this.sigla = sigla;
		this.nome = nome;
	 	this.ibje = ibje;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbje() {
		return ibje;
	}
	//Metodo
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
