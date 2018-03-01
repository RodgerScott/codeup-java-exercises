import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println(addition(5,6));
//        System.out.println(subtraction(10,5));
//        System.out.println(multiplication(10,5));
//        System.out.println(division(10, 2));
//        System.out.println(remainder(9,2));
//        System.out.println(factorial(2));
//        getFactorial();
//        getDice();
        guessingGame();


    }

//1. Basic Arithmetic

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

//1. Bonuses


//2.

// Factorial Shtuff

    public static long factorial(long a) {
    if (a == 1) {
        return 1;
    }
    return a * (factorial(a-1));
    }


    public static void getFactorial() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 10: ");
        long entry = scan.nextInt();
        scan.nextLine();

        if (entry < 1 || entry > 10) {
            System.out.println("Sorry, that is not a valid number.");
            System.out.println();
            getFactorial();
        } else {
            System.out.println(factorial(entry));

            System.out.println();

            System.out.println("Would you like to play again? y/n");
            String keepGoing = scan.nextLine();

            if (keepGoing.equalsIgnoreCase("y")) {
                getFactorial();
            }
        }
    }

// Dice Rolling

    public static int diceRoll (int a) {
        Random numb = new Random();
        return numb.nextInt(a) + 1;
    }

    public static void getDice () {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter the number of sides for your dice: ");
        int entry = scan.nextInt();
        scan.nextLine();

        System.out.print("Ready to roll? y/n");
        String readyToRoll = scan.nextLine();

        if (readyToRoll.equalsIgnoreCase("y")) {
            System.out.println(diceRoll(entry));
            System.out.println(diceRoll(entry));
        }

        else if (!readyToRoll.equalsIgnoreCase("y")){
            getDice();
        }

        System.out.println("Would you like to play again?");
        String keepGoing = scan.nextLine();

        if (keepGoing.equalsIgnoreCase("y")) {
            getDice();
        } else {
            System.out.println("Goodbye!");
        }
    }


//Game Development 101

    public static int rando () {
        Random rando = new Random();
        int randResult = rando.nextInt(100) + 1;
        return randResult;
    }

    public static void guessingGame () {
        Scanner scan = new Scanner(System.in);
        int target = rando();
        boolean end = true;

        System.out.println("Welcome to the Random Number Guessing Game.");
        System.out.println();

        do {
            System.out.print("Please guess a number between 1 and 100: ");
            int value = scan.nextInt();
            scan.nextLine();

            if (value < target) {
                System.out.println("Guess Higher");
            }
            else if (value > target) {
                System.out.println("Guess Lower");
            }
            else {
                System.out.println("Good Guess!");
                end = false;
            }
        } while (end);
    }
}

