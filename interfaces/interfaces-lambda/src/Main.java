public class Main {

  public static void main(String[] args) {
    irMusica(new Computador());
    irVideo(new Computador());

  }
  public static void irVideo(VideoPlayer videoPlayer){
    videoPlayer.tocarVideo();
  }
  public static void irMusica(MusicPlayer musicPlayer){
    musicPlayer.tocarMusica();
  }
}
