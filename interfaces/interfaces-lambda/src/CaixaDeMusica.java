public class CaixaDeMusica  implements MusicPlayer{
  @Override
  public void tocarMusica() {
    System.out.println("Tocando a musica");
  }

  @Override
  public void pausarMusica() {
    System.out.println("Pausando a musica");
  }

  @Override
  public void pararMusica() {
    System.out.println("parando a musica");
  }
}
