public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Estudar tipos primitivos.
        // Estudar classe String que representa texto na aplicação.

        String meuNome = "Diego Rodrigues";

        double salarioMinino = 2500.03; 

        short numeroCurto = 1;
        int numeroNormal1 = numeroCurto;
        short numeroCurto2 = (short) numeroNormal1;

        /** 
         Short entre () é um cast que tranforma um int em short para caber na variavel short
         Estou passando um valor int em uma variavel short que nao caberia por isso uso do 'cast'.
         para garantir que o valor ira caber.
        */ 
        int numero = 5;

        numero = 10;

        System.out.println(numero);

        //A palavra reservada final garante que a variavel PI nunca ira receber outro valor.
        final double PI = 3.14;

        //Por convenção toda variavel com final deve ser escrita em CAIXA ALTA.


    }
}
