/*
 * 4. Escreva um método utilizando Supplier para retornar uma data com o LocalDate.now();
 * */

package dev_makers.aula03;

import java.time.LocalDate;
import java.util.function.Supplier;

public class Exercise04 {
    public static void main(String[] args) {
        Supplier<LocalDate> getLocalDate = LocalDate::now;
        System.out.println(supplyALocalDate(getLocalDate));
    }

    private static LocalDate supplyALocalDate(Supplier<LocalDate> supplier) {
        return supplier.get();
    }
}
