
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SchemeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/scheme.csv")
    public void restThreeMonthsYear(int expected, int income, int expense, int threshold) {
        SchemeService service = new SchemeService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
