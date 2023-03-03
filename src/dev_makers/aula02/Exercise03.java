/*
 * 3. A partir da sua data de nascimento, faça um programa que calcule as seguintes informações;
 *       a) Qual dia da semana era;
 *       b) Qual foi o dia da semana do primeiro dia daquele mês;
 *       c) Qual foi o dia da semana do primeiro dia daquele ano;
 *       d) Qual foi o dia da semana do último dia daquele mês;
 *       e) Qual foi o dia da semana do último dia daquele ano;
 *       f) Qual foi o dia da primeira sexta feira após aquela data;
 * */

package dev_makers.aula02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Exercise03 {
    private static final LocalDate BIRTHDAY = LocalDate.of(2001,1,1);

    public static void main(String[] args) {
        Locale localeBrazil = Locale.forLanguageTag("pt-BR");

        DayOfWeek birthdayDayOfWeek = BIRTHDAY.getDayOfWeek();
        System.out.println("dia da semana da data de nascimento fictícia: " +
                           birthdayDayOfWeek.getDisplayName(TextStyle.FULL, localeBrazil));

        DayOfWeek dayOfWeekOfFirstDayOfBirthdayMonth = BIRTHDAY.withDayOfMonth(1).getDayOfWeek();
        System.out.println("dia da semana do primeiro dia do mês da data de nascimento fictícia: " +
                dayOfWeekOfFirstDayOfBirthdayMonth.getDisplayName(TextStyle.FULL_STANDALONE, localeBrazil));

        DayOfWeek dayOfWeekOfFirstDayOfBirthdayYear = BIRTHDAY.withDayOfYear(1).getDayOfWeek();
        System.out.println("dia da semana do primeiro dia do ano da data de nascimento fictícia: " +
                           dayOfWeekOfFirstDayOfBirthdayYear.getDisplayName(TextStyle.FULL, localeBrazil));

        DayOfWeek dayOfWeekOfLastDayOfBirthdayMonth = BIRTHDAY.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("dia da semana do último dia do mês da data de nascimento fictícia: " +
                           dayOfWeekOfLastDayOfBirthdayMonth.getDisplayName(TextStyle.FULL_STANDALONE, localeBrazil));

        DayOfWeek dayOfWeekOfLastDayOfBirthdayYear = BIRTHDAY.withMonth(12).withDayOfMonth(31).getDayOfWeek();
        System.out.println("dia da semana do último dia do ano da data de nascimento fictícia: " +
                           dayOfWeekOfLastDayOfBirthdayYear.getDisplayName(TextStyle.FULL, localeBrazil));

        LocalDate firstFridayAfterBirthday = BIRTHDAY.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("primeira sexta-feira após a data de nascimento fictícia: " +
                           firstFridayAfterBirthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
