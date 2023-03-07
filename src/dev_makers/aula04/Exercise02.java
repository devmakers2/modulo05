/*
 * 2) Agregação de dados: dada uma lista de números inteiros, crie uma stream finita,
 *      e use o método reduce para calcular a soma de todos os números.
 * */

package dev_makers.aula04;

import java.util.List;
import java.util.Optional;

public class Exercise02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 6, 7, 9);
        Optional<Integer> optionalOfSum = list.stream().reduce(Integer::sum);
        Integer sum = optionalOfSum.orElse(0);
        System.out.println(sum);
    }
}
