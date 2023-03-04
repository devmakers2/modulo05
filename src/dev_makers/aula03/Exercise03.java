/*
 * 3. Escreva um método utilizando Consumer para imprimir elementos de uma lista;
 * */

package dev_makers.aula03;

import java.util.List;
import java.util.function.Consumer;

public class Exercise03 {
    public static void main(String[] args) {
        List<Object> list = List.of(0., 1, 'a', true, "B");
        Consumer<Object> printer = System.out::println;
        doSomethingWithAList(list, printer);
    }

    private static void doSomethingWithAList(List<Object> list, Consumer<Object> consumer) {
        list.forEach(consumer);
    }
}
