import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
     public static void main(String[] args) {
        String [] candidatos = {"Lucas", "Mariana", "Carlos", "Fernanda",
        "Gabriel" };
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }   
    }
    static void entrandoEmContato(String candidato ){
        int tentativasRealizados = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando){
                tentativasRealizados++;
            }

        }while(continuaTentando && tentativasRealizados < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " Na " + tentativasRealizados);
        }else {
            System.out.println("Não consegumos contato com " + candidato );
        }
    }
    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionado(){
        String [] candidatos = {"Lucas", "Mariana", "Carlos", "Fernanda",
        "Gabriel" };
        System.out.println("Imprimindo candidatos selecionados");
        for(int i = 0;i < candidatos.length; i++ ){
            System.out.println(" candidato selecinado "+ (i+1) + " é " + candidatos[i]);
        }
        System.out.println("Forma abreviada sem indice");
        for(String candidato : candidatos){
            System.out.println("candidato selecionado " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Lucas", "Mariana", "Carlos", "Fernanda",
        "Gabriel", "Ana", "Ricardo", "Juliana",
        "Pedro", "Camila" };

    
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou esse salario " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + "Foi selecionado para entrevista");
                candidatosSelecionados ++;
            }
            candidatosAtual++;
        }
        System.out.println("Finalizado seleção de candidatos " + candidatosSelecionados);
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
    
        Double salarioBase = 2000.0;
    
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO OS DEMAIS CANDIDATOS");
        }
    }
}
