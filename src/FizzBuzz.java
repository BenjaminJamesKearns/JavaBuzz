import java.util.Scanner; // import required to take user input

public class FizzBuzz { //this class is used to run fizzbuzz

    public static Scanner in = new Scanner(System.in); // setup to take user input

    public static void enterANumber() {

        System.out.println("Enter a number");
        while (!in.hasNextInt()) {
            System.out.println("Please enter a number");
            in.next();
        }
        int input = in.nextInt();
        FizzBuzz.calculation(input);
    }

    public static String calculation(int num) {
        if (num%3==0 && num%5==0) {return("FizzBuzz");}
        else if (num%3==0) {return("Fizz");}
        else if (num%5==0) {return("Buzz");}
        else {return(Integer.toString(num));}
    }

}
