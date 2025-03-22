public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicidado = 22.0;

        if (valorSolicidado < saldo){
            saldo = saldo - valorSolicidado;
            System.out.println("Novo saldo " + saldo);
        }else
            System.out.println("Saldo insuficiente");

    }
}
