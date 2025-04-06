public class Main {
  public static void main(String[] args) {
    Relogio brRelogio = new RelogioBrasileiro();
    brRelogio.setSegundos(0);
    brRelogio.setMinuto(0);
    brRelogio.setHora(13);


    System.out.println(brRelogio.getTime());

    System.out.println(new RelogioAmericano().converte(brRelogio).getTime());

    }


  }
