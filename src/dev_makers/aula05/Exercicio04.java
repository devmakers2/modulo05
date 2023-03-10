/*
 * 4. Dada uma lista de transações, encontre o total de transações por cliente;
 *
 * Transação: jorge, 10
 * Transação: maria, 20
 * Transação: jorge, 5
 *
 * resultado: Map -> jorge=15, maria=20
 * */

package dev_makers.aula05;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio04 {
    public static void main(String[] args) {
        List<Transaction> list = List.of(new Transaction("Alice", new BigDecimal("1")),
                                         new Transaction("Bob", new BigDecimal("22")),
                                         new Transaction("Charlie", new BigDecimal("333")),
                                         new Transaction("David", new BigDecimal("4444")),
                                         new Transaction("Ezequiel", new BigDecimal("55555")),
                                         new Transaction("Ezequiel", new BigDecimal("2")),
                                         new Transaction("Ezequiel", new BigDecimal("3")));

        Map<String, BigDecimal> totalByClientName = list.stream()
                .collect(Collectors.toMap(Transaction::getClientName, Transaction::getValue, BigDecimal::add));

        System.out.println(totalByClientName);
    }
}

class Transaction {
    private String clientName;
    private BigDecimal value;

    public Transaction(String clientName, BigDecimal value) {
        this.clientName = clientName;
        this.value = value;
    }

    public String getClientName() {
        return clientName;
    }

    public BigDecimal getValue() {
        return value;
    }
}
