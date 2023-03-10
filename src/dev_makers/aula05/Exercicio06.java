/*
 * 6. Dado uma lista de números, encontre o segundo maior número;
 * */

package dev_makers.aula05;

import java.util.List;

public class Exercicio06 {
    public static void main(String[] args) {
        List<Double> list = List.of(.0, 1., 2.2, 33.3, 44.44);

        list.stream()
                .mapToDouble(number -> number)
                .distinct()
                .sorted()
                .skip(list.size() - 2L)
                .findFirst()
                .ifPresent(number -> System.out.println("o segundo maior número é " + number));
    }
}
