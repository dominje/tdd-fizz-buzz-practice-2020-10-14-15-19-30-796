package tdd.fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final int MODULO_3 = 3;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_5 = 5;
    private static final int MODULO_7 = 7;
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";

    public String countOff(int inputNumber) {
        if(inputNumber % MODULO_3 == 0 && inputNumber % MODULO_5 == 0){
            return FIZZ_BUZZ;
        } else if(inputNumber % MODULO_3 == 0 && inputNumber % MODULO_7 == 0){
            return FIZZ_WHIZZ;
        } else if(inputNumber % MODULO_3 == 0){
            return FIZZ;
        } else if(inputNumber % MODULO_5 == 0){
            return BUZZ;
        } else if(inputNumber % MODULO_7 == 0){
            return WHIZZ;
        }
        return "";
    }
}
