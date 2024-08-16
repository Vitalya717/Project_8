
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SchemeServiceTest {
    @Test
    void restThreeMonthsYear() {
        SchemeService service = new SchemeService();

        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        long expected = 3;
        long actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void restTwoMonthsYear() {
        SchemeService service = new SchemeService();

        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        long expected = 2;
        long actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
