/*
 * 7. Dado um texto, retorne um mapa com a frequência de cada palavra;
 *
 * exemplo:
 * --> feliz dia das mulheres para vocês mulheres da turma
 * feliz=1, dia=1, das=1, mulheres=2, para=1, vocês=1, da=1, turma=1
 * */

package dev_makers.aula05;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercicio07 {
    public static void main(String[] args) {
        String string = "um. texto qualquer um, um";

        String cleanedString = stringCleaner(string);

        Map<String, Integer> wordsCounts = Arrays.stream(cleanedString.split(" "))
                .collect(Collectors.toMap(Function.identity(), word -> 1, (number1, number2) -> number1 + 1));

        System.out.println(wordsCounts);
    }

    private static String stringCleaner(String string) {
        return string.replaceAll("[,.;!?]", "");
    }
}
