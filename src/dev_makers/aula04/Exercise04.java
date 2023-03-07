/*
 * 4) Ordenação de dados: dada uma lista de números inteiros, crie uma stream finita,
 *      e use o método sorted para classificá-los em ordem crescente.
 * */

package dev_makers.aula04;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise04 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
