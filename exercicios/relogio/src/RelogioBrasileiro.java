public  non-sealed class RelogioBrasileiro extends Relogio {


  @Override
   public Relogio converte( Relogio relogio) {
    this.segundos = relogio.getSegundos();
    this.minuto =  relogio.getMinuto();
    switch (relogio){
      case RelogioAmericano relogioAmericano -> {
        this.hora = (relogioAmericano.getHoraDoDia().equals("PM")) ? relogioAmericano.getHora() + 12 : relogioAmericano.getHora();
      }
      case RelogioBrasileiro relogioBrasileiro -> this.hora = relogioBrasileiro.getHora();
    }
    return this;
  }


}
