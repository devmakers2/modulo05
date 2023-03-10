/*
 * Obs.: utilizar stream de primitivos quando necessário
 *
 * 1. Dado uma lista de inteiros, encontre a soma de todos os números da lista;
 * */

package dev_makers.aula05;

import java.util.List;
import java.util.stream.IntStream;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2, 3, 4);
        IntStream intStream = list.stream().mapToInt(number -> number);
        int sum = intStream.sum();
        System.out.println("a soma de todos os números é " + sum);
    }
}
