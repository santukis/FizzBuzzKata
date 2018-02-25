
public class FizzBuzz {

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private Writer writer;

    public FizzBuzz(Writer writer) {
        this.writer = writer;
    }

    public void printValue(int number) {
        writer.print(getValue(number));
    }

    private String getValue(int number) {

        String response = "";

        if(isMultipleOf(number, THREE)) response += FIZZ;

        if(isMultipleOf(number, FIVE)) response += BUZZ;

        if(response.isEmpty()) response = String.valueOf(number);

        return response;
    }

    private boolean isMultipleOf(int number, int of) {
        return number % of == 0;
    }
}
