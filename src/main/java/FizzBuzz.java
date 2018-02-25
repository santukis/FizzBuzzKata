public class FizzBuzz {


    private static final String FIZZ = "FIZZ";

    public String getValue(int number) {

        if(number % 3 == 0)
            return FIZZ;

        return String.valueOf(number);
    }
}
