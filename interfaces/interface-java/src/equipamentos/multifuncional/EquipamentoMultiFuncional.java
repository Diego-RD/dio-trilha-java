package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    System.out.println("COPIANDO VIA EQUIPAMENTO MULTI");
  }

  @Override
  public void digitalizar() {
    System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTI");
  }

  @Override
  public void imprir() {
    System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTI");
  }
}
