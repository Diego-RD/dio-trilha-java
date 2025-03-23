public class ExemploFor {
  public static void main(String[] args) {

    // Estrutura do for for(bloco de iniciação ou VAR; bloco boolean ou condiçõa; bloco de atualizacão ou incremento)

    for(int carneirinho = 1; carneirinho <=20; carneirinho ++){
      System.out.println("Contando..." + carneirinho);
    }
    System.out.println("Finalizado");

    //estrutura 2
    //o que importa é somente o bloco condicional
    int carneirinhos = 1;
    for( ; carneirinhos <=5; ) {
       System.out.println(carneirinhos + " - Carneirinho(s)");
       carneirinhos ++;
    }
    System.out.println("Acabou...");

  }
  
}