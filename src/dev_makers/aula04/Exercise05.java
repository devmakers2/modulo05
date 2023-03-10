/*
 * 5) Crie o objeto Pessoa com os atributos nome:string e idade:integer;
 *      no método main inicialize uma lista de pessoas;
 *      use a stream para:
 *          — filtrar somente pessoas com mais de 18 anos
 *          — transformar em uma lista somente dos nomes dessas pessoas
 *          — limitar a no máximo 3 resultados (limit())
 *          — retornar uma lista dessa stream
 *          — imprimir essa lista
 * */

package dev_makers.aula04;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise05 {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 1);
        Person bob = new Person("Bob", 2);
        Person charlie = new Person("Charlie", 3);
        Person david = new Person("David", 42);

        List<Person> list = List.of(alice, bob, charlie, david);

        List<String> listOfNames = list.stream()
                                       .filter(person -> person.getAge() >= 18)
                                       .map(Person::getName)
                                       .limit(3)
                                       .collect(Collectors.toList());

        System.out.println(listOfNames);
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}
