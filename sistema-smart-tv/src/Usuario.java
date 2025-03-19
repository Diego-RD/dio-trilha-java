public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();   

        System.out.println("Volume Atual? :" +smartTv.volume);

        System.out.println("Canal Autal? :" +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Autal? :" +smartTv.canal);

        System.out.println("TV esta ligada? :" + smartTv.ligada);
        System.out.println("Canal Autal? :" +smartTv.canal);
        System.out.println("Volume Atual? :" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV esta ligada? :" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV esta ligada? :" + smartTv.ligada);

    }
}
