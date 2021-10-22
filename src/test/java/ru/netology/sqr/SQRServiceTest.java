package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "testPositive, 200,300,3",
            "testNegative, -5,1000,22 ",
            "testZeroValue, 0,99,0 ",
    })
    void shouldCounter(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();


        long actual = service.counter(min, max);

        assertEquals(expected, actual);
    }
}