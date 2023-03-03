/*
 * 2. A partir da data atual, calcule e imprima uma compra de R$ 64.000,00 parcelado em 48x,
 *      imprima o valor e a data de cada parcela usando a nova API de datas do Java.
 *      Obs.: com uma nova regra;
 *          Caso a data do pagamento seja no final de semana, a data do pagamento deve ser postergada para
 *          a primeira segundafeira subsequente, porém sem alterar a data dos próximos pagamentos!
 * */

package dev_makers.aula02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise02 {
    private static final BigDecimal TOTAL = new BigDecimal("64000");
    private static final long NUMBER_OF_INSTALLMENTS = 48;

    public static void main(String[] args) {
        BigDecimal installment = TOTAL.divide(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS),2, RoundingMode.HALF_EVEN);

        BigDecimal firstInstallment = TOTAL.subtract(installment.multiply(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS - 1)));
        System.out.format("valor da parcela: R$ %,.2f", firstInstallment);
        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate installmentDate = today;
        if (installmentDate.getDayOfWeek() == DayOfWeek.SATURDAY || installmentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
            installmentDate = installmentDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        }
        System.out.println("data da parcela: " + installmentDate);

        for (int i = 1; i < NUMBER_OF_INSTALLMENTS; i++) {
            System.out.println("----------");
            System.out.format("valor da parcela: R$ %,.2f", installment);
            System.out.println();

            installmentDate = today.plusMonths(i);
            if (installmentDate.getDayOfWeek() == DayOfWeek.SATURDAY || installmentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                installmentDate = installmentDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            }
            System.out.println("data da parcela " + installmentDate);
        }
    }
}
