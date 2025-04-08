package autodromo;

public abstract class Veiculo {
    // aqui usamos o veiculo como classe abstrata pq toda classe que quiser se rum veiculo
    // precisa ligar entao criamos um metodo aqui porem ele nao tem corpo {} o corpo
    // fica na classe filha aqio fechamos o metodo com ;
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();

}
