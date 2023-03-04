/*
 * 2. Escreva um método utilizando Function que receba um número e retorne o dobro daquele número;
 * */

package dev_makers.aula03;

import java.util.function.Function;

public class Exercise02 {
    public static void main(String[] args) {
        Function<Double, Double> multiplyByTwo = number -> number * 2;

        System.out.println(changeNumber(0., multiplyByTwo));
        System.out.println(changeNumber(1.1, multiplyByTwo));
        System.out.println(changeNumber(2.2, multiplyByTwo));
        System.out.println(changeNumber(3.3, multiplyByTwo));
        System.out.println(changeNumber(4.4, multiplyByTwo));
    }

    private static Double changeNumber(Double number, Function<Double, Double> function) {
        return function.apply(number);
    }
}
