public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "T"; // M /T / B

    switch (plano) {
      case "T":{
        System.out.println("5GB Youtube");
      }
      case "M":{
        System.out.println("Whats e Instagram grátis");
      }
      case "B":{
        System.out.println("100 minutos de ligação");
      }
      default:
        break;
    }
  }
  
}
