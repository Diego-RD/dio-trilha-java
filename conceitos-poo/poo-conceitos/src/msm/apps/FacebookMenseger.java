package msm.apps;

public class FacebookMenseger extends ServicoMensagem {
  @Override
  public void enviarMensagem() {
    validarInternet();
    System.out.println("Enviando mensagem Facebook");
    salvarHistorioco();
  }

  @Override
  public void recebendoMensagem() {
    System.out.println("Enviando mensagem Facebook");
  }
}
