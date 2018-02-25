public class FizzBuzz {

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public String getValue(int number) {

        String response = "";

        if(isMultiple(number, THREE)) response += FIZZ;

        if(isMultiple(number, FIVE)) response += BUZZ;

        if(response.isEmpty()) response = String.valueOf(number);

        return response;
    }

    private boolean isMultiple(int number, int of) {
        return number % of == 0;
    }
}
