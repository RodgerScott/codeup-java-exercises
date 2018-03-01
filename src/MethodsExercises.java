import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println(addition(5,6));
//        System.out.println(subtraction(10,5));
//        System.out.println(multiplication(10,5));
//        System.out.println(division(10, 2));
//        System.out.println(remainder(9,2));
//        System.out.println(factorial(2));
        getFactorial();

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

        if (entry < 1 || entry > 10) {
            System.out.println("Sorry, that is not a valid number.");
            getFactorial();
        }

        else {

        }

        System.out.println(factorial(entry));

        System.out.println();

        System.out.println("Would you like to play again? y/n");
        String keepGoing = scan.nextLine();
        scan.nextLine();
        System.out.println();

        if (keepGoing.equalsIgnoreCase("y")) {
            getFactorial();
            scan.nextLine();
        }
        else {
            System.out.println("Goodbye");
        }

    }

}

