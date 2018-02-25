public class FizzBuzz {


    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";

    public String getValue(int number) {

        String response = "";

        if(number % 3 == 0)
            response += FIZZ;

        if(number % 5 == 0)
            response += BUZZ;

        if(response.isEmpty())
            response = String.valueOf(number);
        
        return response;
    }
}
