public non-sealed class RelogioAmericano extends Relogio{

    private String horaDoDia;

  public String getHoraDoDia() {
    return horaDoDia;
  }

  public void setarHoraPM (){
    this.horaDoDia = "PM";
  }

  public void setarHoraAM (){
    this.horaDoDia = "AM";
  }

  public void setHora(int hora) {
    setarHoraAM();
    if((hora >= 12) && (hora <=23)){
      setarHoraPM();
      this.hora = hora - 12;
    }else if (hora >= 24){
      this.hora = 0;
    }else {
      this.hora = hora;
    }
  }

  @Override
  Relogio converte(Relogio relogio) {
    this.segundos = relogio.getSegundos();
    this.minuto =  relogio.getMinuto();
    switch (relogio){
      case RelogioAmericano relogioAmericano -> {
        this.hora = relogioAmericano.getHora();
        this.horaDoDia = relogioAmericano.getHoraDoDia();
      }
      case RelogioBrasileiro relogioBrasileiro -> this.setHora(relogio.getHora());

    }

    return this;
  }

  @Override
  public String getTime() {
    return super.getTime() + " " + this.horaDoDia;
  }
}
