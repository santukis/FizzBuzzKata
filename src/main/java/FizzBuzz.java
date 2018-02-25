public class FizzBuzz {


    private static final String FIZZ = "FIZZ";

    public String getValue(int number) {

        if(number % 3 == 0)
            return FIZZ;

        if(number % 5 == 0)
            return "BUZZ";

        return String.valueOf(number);
    }
}
