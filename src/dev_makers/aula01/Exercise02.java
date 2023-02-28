// A partir da data atual, calcule e imprima uma compra de R$ 64.000,00 parcelado em 48x.
// Imprima o valor e a data de cada parcela usando a nova API de datas do Java.

package dev_makers.aula01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Exercise02 {
    private static final BigDecimal TOTAL = BigDecimal.valueOf(64_000);
    private static final int NUMBER_OF_INSTALLMENTS = 48;

    public static void main(String[] args) {
        BigDecimal installment = TOTAL.divide(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS), 2, RoundingMode.HALF_EVEN);

        LocalDate today = LocalDate.now();

        BigDecimal firstInstallment = TOTAL.subtract(installment.multiply(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS).
                                                                                     subtract(BigDecimal.ONE)));

        System.out.format("valor da parcela: R$ %,.2f", firstInstallment);
        System.out.println();
        System.out.println("data da parcela: " + today);

        for (int i = 1; i < NUMBER_OF_INSTALLMENTS; i++) {
            System.out.println("----------");
            System.out.format("valor da parcela: R$ %,.2f", installment);
            System.out.println();
            System.out.println("data da parcela: " + today.plusMonths((long) i + 1));
        }
    }
}
