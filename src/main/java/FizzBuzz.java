public class FizzBuzz {


    public String getValue(int number) {

        if(number % 3 == 0)
            return "FIZZ";

        return String.valueOf(number);
    }
}
