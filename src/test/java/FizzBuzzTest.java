import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final int ANY_NUMBER_NOT_MULTIPLE_3_5 = 1;

    @Test
    public void shouldReturnValueWhenNumberNotMultiple3_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = "";

        value = fizzBuzz.getValue(ANY_NUMBER_NOT_MULTIPLE_3_5);

        assertEquals(String.valueOf(ANY_NUMBER_NOT_MULTIPLE_3_5), value);
    }

    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = "";

        value = fizzBuzz.getValue(6);

        assertEquals(String.valueOf(6), value);
    }
}
