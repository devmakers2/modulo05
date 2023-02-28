// Dado uma data e hora específica em string,
// use a nova API de data do Java para criar um objeto LocalDate, LocalTime, e LocalDateTime, e imprimí-los;

package dev_makers.aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite data no formato ano-mês-dia: ");
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        System.out.print("digite horário no formato hora:minuto: ");
        String timeString = scanner.nextLine();
        LocalTime time = LocalTime.parse(timeString);

        LocalDateTime dateAndTime = LocalDateTime.of(date, time);

        System.out.println("data: " + date);
        System.out.println("horário: " + time);
        System.out.println("data e horário: " + dateAndTime);
    }
}
