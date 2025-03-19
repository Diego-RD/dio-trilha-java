public class Operadores {
  
  public static void main(String[] args) {

    // Operadores LÓGICOS.

    boolean condicao1 = true;

    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("As duas condicoes são verdadeiras");
    }
    
    if (condicao1 || condicao2) {
      System.out.println("Uma das condicoes é verdadeira");
    }
    System.out.println("Fim");

    // Operadores RELACIONAIS.

    String nome1 = "Diego";
    String nome2 = new String("Diego");

    System.out.println(nome1.equals(nome2));

    // Aqui eu nao conseguiria fazer um relacao de == pq são 2 objetos se fossem numero os java consegue porem objetos usamos o metódo equals para fazer verificação.

    int numero1 = 1 , numero2 = 2 ;

    boolean simNao = numero1 == numero2;
    // pergunta se numero 1 é igual a numero 2 e salva na variavel simNão
    System.out.println("numero1 é igual a numero2? " + simNao);

    simNao = numero1 != numero2;
    //pergunta se numero1 e direfente de numero 2 e salva novamente na variavel simNao
    System.out.println("numero 1 é direfente de numero2? " + simNao);

    System.out.println(simNao);

    //Operadores TERNÁRIO
    int a, b;
    a = 5;
    b = 6;
 
    String resultado = a==b ? "Verdadeiro" : "False";

    System.out.println(resultado);

    // Na expressão  booleana acima vemos um operador ternário onde ? seria if e : seria else uma forma simpolificade de excreve rum IF ELSE.

    boolean variavel = true;

    System.out.println(!variavel);

    // por mais que variavel foi salva como true aqui ela exibe false por conta do !
    //porem ali e so salvo na hora da execucção na memoria se imprimir novamante a variavel ela exibe true pq nao foi alterada na memoria como exibe abaixo:
    System.out.println(variavel);
    // aqui invertemos e salvamos e ela imprimi false no final
    variavel = !variavel;

    System.out.println(variavel);
 
    //Operadores UNÁRIOS.

    // x repetições , ++ atribuição -- decremento
    int numero =5;
    numero ++;
    // com o (++) na frente ele incrementa depois  passa o valor atualizado se o (++) estiver depois ele vair mostrar o valor depois o incrtemento.
    System.out.println( ++ numero );

    // Mesma regra para o decremento (--) ele funciona antes como depois da variavel apassada na operação.

    // Aqui entra exemplo de de debug para ver a alteração de cada linha do codigo enquanto ele roda.
    
    //Operadores ARITMÉTICOS.

    String concatenacao = 1+1+1+"1";
    // resultado aqui seria 31 pois aqui ele faz a soma e depois concatena o 1;

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    // depois que a JVM acha uma string no meio de um calculo ele passa a considerar todo o resto como uma string o resultado seria: 1111 fazendo uma concatenação de todo resto.
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    // porem aqui ele pega o 1 e concatena com a operação ja realizado por estra entre () resultando em 13.

    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);
    
  }
    
}
