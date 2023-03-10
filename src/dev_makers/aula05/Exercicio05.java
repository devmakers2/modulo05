/*
 * 5. Dado uma lista de livros, encontre o autor mais popular baseado na quantidade de livros vendidos;
 * */

package dev_makers.aula05;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio05 {
    public static void main(String[] args) {
        Book asd = new Book("Asd", "authorA", 0);
        Book bnm = new Book("Bnm", "authorB", 1);
        Book cvb = new Book("Cvb", "authorC", 22);
        Book dfg = new Book("Dfg", "authorD", 333);
        Book ert = new Book("Ert", "authorE", 44);
        Book ewq = new Book("Ewq", "authorE", 300);
        Book edc = new Book("Edc", "authorE", 2);

        List<Book> list = List.of(asd, bnm, cvb, dfg, ert, ewq, edc);

        Map<String, Integer> unitsSoldByAuthor = list.stream()
                .collect(Collectors.toMap(Book::getAuthor, Book::getUnitsSold, Integer::sum));

        unitsSoldByAuthor.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .ifPresent(System.out::println);
    }
}

class Book {
    private String title;
    private String author;
    private int unitsSold;

    public Book(String title, String author, int unitsSold) {
        this.title = title;
        this.author = author;
        this.unitsSold = unitsSold;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getUnitsSold() {
        return unitsSold;
    }
}
