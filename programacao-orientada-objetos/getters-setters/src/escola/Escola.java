package escola;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Homem");
    
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");

    felipe.setNome("Felipe Junior");


    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");

  }
}
