import org.junit.Before;
import org.junit.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class FizzBuzzTest {

    private static final int ANY_NUMBER_NOT_MULTIPLE_3_5 = 1;
    private static final int ANY_NUMBER_MULTIPLE_OF_3 = 6;
    private static final int ANY_NUMBER_MULTIPLE_OF_5 = 10;
    private static final int ANY_NUMBER_MULTIPLE_OF_3_AND_5 = 15;

    private FizzBuzz fizzBuzz;
    private Writer mockedWriter;

    @Before
    public void setUp() {
        mockedWriter = mock(Writer.class);
        fizzBuzz = new FizzBuzz(mockedWriter);
    }

    @Test
    public void shouldPrintValueWhenNumberNotMultiple3_5() {
        fizzBuzz.printValue(ANY_NUMBER_NOT_MULTIPLE_3_5);

        verifyPrintValue(String.valueOf(ANY_NUMBER_NOT_MULTIPLE_3_5));
    }

    @Test
    public void shouldPrintFizzWhenNumberIsMultipleOf3() {
        fizzBuzz.printValue(ANY_NUMBER_MULTIPLE_OF_3);

        verifyPrintValue("FIZZ");
    }

    @Test
    public void shouldPrintBuzzWhenNumberIsMultipleOf5() {
        fizzBuzz.printValue(ANY_NUMBER_MULTIPLE_OF_5);

        verifyPrintValue("BUZZ");
    }

    @Test
    public void shouldPrintFizzBuzzWhenNumberIsMultipleOf3And5() {
        fizzBuzz.printValue(ANY_NUMBER_MULTIPLE_OF_3_AND_5);

        verifyPrintValue("FIZZBUZZ");
    }

    private void verifyPrintValue(String value) {
        verify(mockedWriter).print(eq(value));
    }
}
