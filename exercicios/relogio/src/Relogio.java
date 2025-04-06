public sealed abstract class Relogio permits RelogioBrasileiro, RelogioAmericano{

  protected int hora;

  protected int minuto;

  protected int segundos;

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    if (hora >= 24){
      this.hora = 24;
      return;
    }
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    if(minuto >= 60){
      this.minuto = 60;
      return;
    }
    this.minuto = minuto;
  }

  public int getSegundos() {
    return segundos;
  }

  public void setSegundos(int segundos) {
    if(segundos >= 60){
      this.segundos = 60;
      return;
    }
    this.segundos = segundos;
  }

  private String formatar( int value){
    return value <9 ? "0" + value : String.valueOf(value);
  }

  public String getTime() {

    return  formatar(hora) + ":" + formatar(minuto) + ":" + formatar(segundos);
  }
  abstract Relogio converte(Relogio relogio);

}
