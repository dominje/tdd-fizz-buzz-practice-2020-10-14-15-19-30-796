package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final int MODULO_3 = 3;
    public static final String BUZZ = "Buzz";
    public static final int MODULO_5 = 5;

    public String countOff(int inputNumber) {
        if(inputNumber % MODULO_3 == 0){
            return FIZZ;
        } else if(inputNumber % MODULO_5 == 0){
            return BUZZ;
        }
        return "";
    }
}
