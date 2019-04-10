import java.util.Scanner; // import required to take user input

class Menu { // this class will be used to display the menu to the user
    public static Scanner in = new Scanner(System.in); // setup to take user input

    public static void main(String[] args) {Menu.menu();} // calls the menu method when the program starts

    public static void menu() {

        System.out.println("---------------------"); // displays the menu
        System.out.println("| 1. Enter a number |");
        System.out.println("| 2. Exit           |");
        System.out.println("---------------------");

        String input = in.nextLine(); // takes the user input

        switch(input) {
            case "1": FizzBuzz.enterANumber();
                      break;
            case "2": System.exit(0); // closes program if user selects option 2
                      break;
            default:  System.out.println("Please enter either 1 or 2"); // error message if user doesn't enter 1 or 2
                      Menu.menu(); // takes user back to the menu
                      break;
        }
    }
}