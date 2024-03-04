import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test for the Calculator class")
class CalculatorTest {

    private static Calculator calc;

    @BeforeAll
    static void setup() {
        calc = new Calculator();
    }

    @Nested
    class CalculatorTestPositive {
        @Tag("Positive")
        @Test
        @DisplayName("Test with both arguments positive, expecting positive result")
        void testMultiply() {
            int expectedResult = 20;
            int actualResult = calc.multiply(4, 5);

            assertEquals(expectedResult, actualResult);
        }
    }


    @Timeout(1)
    @DisplayName("Test with one negative argument, expecting negative result")
    @Test
    void testMultiplyNegative() {
        int expectedResult = -20;
        int actualResult = calc.multiply(-4, 5);

        assertEquals(expectedResult, actualResult);
    }
}