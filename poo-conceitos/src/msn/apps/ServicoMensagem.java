package msn.apps;

public abstract class ServicoMensagem {

  public abstract void enviarMensagem();
  public abstract void recebendoMensagem();
  protected void validarInternet(){
    System.out.println("Validando se esta concetado a internet");
  }
  protected void salvarHistorioco(){
    System.out.println("Salvando historico de mensagens");
  }
}
