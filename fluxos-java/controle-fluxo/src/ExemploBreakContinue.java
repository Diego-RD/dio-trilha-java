public class ExemploBreakContinue {
  public static void main(String[] args) {

    // se usar o break, ele para o for todo porem, se colocar o continue no lugar do break ele vai parar somente o if mais nao para o for o for continuara até a condição do for for false.
    for(int numero = 1; numero <=5; numero ++){
      if(numero == 3)
        break;
      
      System.out.println(numero);
      
    }
  }
}
