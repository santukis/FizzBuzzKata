import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
    public void shouldReturnValueWhenNumberNotMultiple3_5() {
        String value = "";

        value = fizzBuzz.getValue(ANY_NUMBER_NOT_MULTIPLE_3_5);

        assertEquals(String.valueOf(ANY_NUMBER_NOT_MULTIPLE_3_5), value);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        String value = "";

        value = fizzBuzz.getValue(ANY_NUMBER_MULTIPLE_OF_3);

        assertEquals("FIZZ", value);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultipleOf5() {
        String value = "";

        value = fizzBuzz.getValue(ANY_NUMBER_MULTIPLE_OF_5);

        assertEquals("BUZZ", value);
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsMultipleOf3And5() {
        String value = "";

        value = fizzBuzz.getValue(ANY_NUMBER_MULTIPLE_OF_3_AND_5);

        assertEquals("FIZZBUZZ", value);
    }

    @Test
    public void shouldPrintValueWhenNumberNotMultipleOf3_5() {
        fizzBuzz.printValue(ANY_NUMBER_NOT_MULTIPLE_3_5);

        verify(mockedWriter).print(eq("1"));
    }
}
