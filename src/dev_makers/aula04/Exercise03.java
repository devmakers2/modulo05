/*
 * 3) Transformação de dados: dada uma lista de strings, crie uma stream finita,
 *      e use o método map para convertê-las em números inteiros.
 * */

package dev_makers.aula04;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise03 {
    public static void main(String[] args) {
        List<String> list = List.of("Alice", "Bob", "Charlie", "David");

        List<Integer> listOfIntegerNumbers = list.stream()
                                                 .map(string -> (int) string.charAt(0))
                                                 .collect(Collectors.toList());

        System.out.println(listOfIntegerNumbers);
    }
}
