public class ExemploArray {
  public static void main(String[] args) {
    // em arrays o indice inicia em ZERO.
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

    //length significa comprimento então nesse for se leria : para -> indice x=0 ; x for menor que tamanho de alunos(Array) -> x++ incremento para nao deixar o for infinito.
    for (int x=0; x<alunos.length; x++) {
      System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }

    //Forma abreviada
	  for(String aluno : alunos) {
	    System.out.println("Nome do aluno é: " + aluno);
	  }
  }  
}
