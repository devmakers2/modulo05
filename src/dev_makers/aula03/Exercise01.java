/*
 * 1. Escreva um método utilizando Predicate que recebe um número e verifica se é par;
 * */

package dev_makers.aula03;

import java.util.function.IntPredicate;

public class Exercise01 {
    public static void main(String[] args) {
        IntPredicate isEven = number -> number % 2 == 0;

        System.out.println(testNumber(0, isEven));
        System.out.println(testNumber(1, isEven));
        System.out.println(testNumber(2, isEven));
        System.out.println(testNumber(3, isEven));
        System.out.println(testNumber(4, isEven));
    }

    private static boolean testNumber(Integer number, IntPredicate predicate) {
        return predicate.test(number);
    }
}
