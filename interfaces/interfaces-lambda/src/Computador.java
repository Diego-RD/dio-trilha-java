public class Computador implements MusicPlayer, VideoPlayer {

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
    System.out.println("Parando a musica");
  }

  @Override
  public void tocarVideo() {
    System.out.println("Reproduzindo o video");
  }

  @Override
  public void pausarVideo() {
    System.out.println("Pausando o video");
  }

  @Override
  public void pararVideo() {
    System.out.println("Parando o videos");
  }
}
