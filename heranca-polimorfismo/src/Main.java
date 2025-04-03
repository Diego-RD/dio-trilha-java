public class Main {

  public static void main(String[] args) {

      //instanciando direto no parametro
      imprimirColaborador(new Gerente());
      imprimirColaborador(new Vendedor());
  }


  public static void imprimirColaborador(Colaborador colaborador){
    System.out.printf("==============%s============\n", colaborador.getClass().getCanonicalName());
    if(colaborador instanceof Gerente){

      //colaborador.setName("Diego");
      // Aqui fazemos um casting passando entre() .
      //((Gerente)colaborador).setLogin("diego");
      //((Gerente)colaborador).setSenha("123456");

      //System.out.println(colaborador.getName());
      //System.out.println(((Gerente)colaborador).getLogin());
      //System.out.println(((Gerente)colaborador).getSenha());
    }
    // Aqui o switch so permite fazer sem default pq colaborador é uma classe sealed pq nao contemplamos todos os cenários.
    switch (colaborador){
      case Gerente gerente ->{
        gerente.setName("Diego");
        gerente.setSalario(5000);
        gerente.setCodigo("123");
        gerente.setLogin("diego");
        gerente.setSenha("123456");
        gerente.setComisao(1200);

        System.out.println(gerente.getName());
        System.out.println(gerente.getCodigo());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getLogin());
        System.out.println(gerente.getSenha());
      }
      case Vendedor vendedor ->{
        vendedor.setName("Lucas");
        vendedor.setCodigo("2345");
        vendedor.setSalario(2800);
        vendedor.setPorcentagemVenda(10);
        vendedor.setCodigo("123");

        System.out.println(vendedor.getName());
        System.out.println(vendedor.getCodigo());
        System.out.println(vendedor.getSalario());
        System.out.println(vendedor.getPorcentagemVenda());

      }
    }

    System.out.printf("===============%s========\n", colaborador.getClass().getCanonicalName());

  }

  
}