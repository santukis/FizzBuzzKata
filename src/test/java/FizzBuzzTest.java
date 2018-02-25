import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void shouldReturnValueWhenNumberNotMultiple3_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 0;

        value = fizzBuzz.getValue(1);

        assertEquals(1, value);
    }
}
