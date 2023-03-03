/*
 * 1. Dado uma data e hora específica, use a nova API de data do Java para
 *    criar um objeto ZonedDateTime com o seu fuso horário e imprimi-lo;
 * */

package dev_makers.aula02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite uma data no formato ano-mês-dia: ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.print("digite um horário no formato hora:minuto: ");
        LocalTime time = LocalTime.parse(scanner.nextLine());

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, ZoneId.systemDefault());
        System.out.println("data e hora informadas com fuso horário da máquina: " + zonedDateTime);
    }
}
