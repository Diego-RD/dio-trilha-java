package functional_interface.desafio_stream_api;

import java.util.*;
import java.util.stream.DoubleStream;


public class Desafios {

  public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, -3);

    // Desafio 1: imprime a lista em ordem crescente.
    List<Integer> numerosCrecente = numeros.stream().sorted().toList();
    System.out.println(numerosCrecente);

    System.out.println("--------------------------");

    // Desafio 2:Somando os numeros pares da list.
    Integer numeroSoma = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);

    System.out.println(numeroSoma);

    System.out.println("--------------------------");

    // Desafio 3:verifica se os itens na lista sao pósitivos,e imprime os positivos
    List<Integer> numerosPositivos = numeros.stream().filter(n -> n > 0).toList();
    System.out.println(numerosPositivos);

    System.out.println("--------------------------");
    // Desafio 4:remova todos os valores impares
    List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();
    System.out.println(numerosPares);

    System.out.println("--------------------------");

    // Desafio 5: Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
    List<Integer> numerosMaior5 = numeros.stream().filter(n -> n > 5).toList();
    System.out.println(numerosMaior5);


  }


}
