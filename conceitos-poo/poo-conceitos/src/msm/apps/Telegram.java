package msm.apps;

public class Telegram extends ServicoMensagem {
  @Override
  public void enviarMensagem() {
    validarInternet();
    System.out.println("Enviando mensagem Telegram");
    salvarHistorioco();
  }

  @Override
  public void recebendoMensagem() {
    System.out.println("Enviando mensagem Telegram");
  }
}
