package junit5.tdd;

public class FizzBuzz {

    public String play(int number){
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }

        if (result.isEmpty()) {
            return String.valueOf(number);
        }
        return result;
    }
}
