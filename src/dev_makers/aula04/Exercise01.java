/*
 * 1) Filtragem de dados: dada uma lista de números inteiros, crie uma stream finita,
 *      e use o método filter para retornar apenas os números pares.
 * */

package dev_makers.aula04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 42);
        Stream<Integer> stream = list.stream();
        Stream<Integer> streamOfEvenNumbers = stream.filter(number -> number % 2 == 0);
        List<Integer> listOfEvenNumbers = streamOfEvenNumbers.collect(Collectors.toList());
        System.out.println(listOfEvenNumbers);
    }
}
