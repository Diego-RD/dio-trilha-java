package msn;

import msn.apps.FacebookMenseger;
import msn.apps.MSNMesseger;
import msn.apps.ServicoMensagem;
import msn.apps.Telegram;

public class User {
  public static void main(String[] args) {
    ServicoMensagem smi = null;
    //chamada de metodos pelo usuario
   String appEscolhido = "tlg";

   if (appEscolhido.equals("msn")){
     smi = new MSNMesseger();
   } else if (appEscolhido.equals("fbm")) {
     smi = new FacebookMenseger();
   } else if (appEscolhido.equals("tlg")) {
     smi = new Telegram();
   }

   smi.enviarMensagem();
   smi.recebendoMensagem();
  }
}
