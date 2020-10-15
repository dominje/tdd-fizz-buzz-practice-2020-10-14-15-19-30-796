package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final int MODULO_3 = 3;

    public String countOff(int inputNumber) {
        if(inputNumber % MODULO_3 ==0){
            return FIZZ;
        } else if(inputNumber % 5 == 0){
            return "Buzz";
        }
        return "";
    }
}
