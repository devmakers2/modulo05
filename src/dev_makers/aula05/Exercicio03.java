/*
 * 3. Dado uma lista de funcionários, calcule a média de salário por departamento;
 * */

package dev_makers.aula05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio03 {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", new BigDecimal("1234.56"), "auditoria");
        Employee bob = new Employee("Bob", new BigDecimal("10000.00"), "bio");
        Employee charlie = new Employee("Charlie", new BigDecimal("987.65"), "controladoria");
        Employee david = new Employee("David", new BigDecimal("3"), "despachos");
        Employee ezequias = new Employee("Ezequias", new BigDecimal("2000.00"), "enfermaria");
        Employee fantine = new Employee("Fantine", new BigDecimal("1500.00"), "enfermaria");
        Employee garcia = new Employee("Garcia", new BigDecimal("1000.00"), "enfermaria");

        List<Employee> list = List.of(alice, bob, charlie, david, ezequias, fantine, garcia);

        Map<String, BigDecimal> totalByDepartment = list.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary, BigDecimal::add));

        Map<String, Integer> numberOfEmployeesByDepartment = list.stream()
                .collect(Collectors.toMap(Employee::getDepartment, employee -> 1, (number1, number2) -> number1 + 1));

        Map<String, BigDecimal> averageByDepartment = totalByDepartment.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .divide(BigDecimal.valueOf(numberOfEmployeesByDepartment.get(entry.getKey())),
                                        RoundingMode.HALF_EVEN)));

        System.out.println(averageByDepartment);
    }
}

class Employee {
    private String name;
    private BigDecimal salary;
    private String department;

    public Employee(String name, BigDecimal salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
