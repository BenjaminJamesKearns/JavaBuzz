import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// the above code imports the files required to run tests

class FizzBuzzTest { // this class is used to test the fizzbuzz class

    // private FizzBuzz fizzbuzz;

    @Test
    public void multipleOfThree() {

        String outcome = FizzBuzz.calculation(6);
        assertEquals(outcome, "Fizz");

    }

    @Test
    public void multipleOfFive() {

        String outcome = FizzBuzz.calculation(10);
        assertEquals(outcome, "Buzz");

    }

    @Test
    public void multipleOfThreeAndFive() {

        String outcome = FizzBuzz.calculation(15);
        assertEquals(outcome, "FizzBuzz");

    }

    @Test
    public void NotAMultiple() {

        int outcome = FizzBuzz.calculation(2);
        assertEquals(outcome, 2);

    }

}