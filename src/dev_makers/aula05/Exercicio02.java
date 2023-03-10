/*
 * 2. Dado uma lista de pessoas, agrupe os nomes por idade;
 * */

package dev_makers.aula05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio02 {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 1);
        Person bob = new Person("Bob", 22);
        Person charlie = new Person("Charlie", 33);
        Person charles = new Person("Charles", 33);
        Person carlos = new Person("Carlos", 33);
        Person david = new Person("David", 44);

        List<Person> persons = List.of(alice, bob, charlie, charles, carlos, david);

        Map<Integer, String> namesByAge = persons.stream()
                .collect(Collectors.toMap(Person::getAge, Person::getName, (name1, name2) -> name1 + " - " + name2));

        System.out.println(namesByAge);
    }
}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
