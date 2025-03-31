package msn.apps;

public class MSNMesseger extends ServicoMensagem {
  @Override
  public void enviarMensagem() {
    validarInternet();
    System.out.println("Enviando mensagem MSN");
    salvarHistorioco();
  }

  @Override
  public void recebendoMensagem() {
    System.out.println("Recebendo mensagem MSN");
  }
}
