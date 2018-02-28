import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println(addition(5,6));
//        System.out.println(subtraction(10,5));
//        System.out.println(multiplication(10,5));
//        System.out.println(division(10, 2));
//        System.out.println(remainder(9,2));
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

    public static void getInteger(int min, int max) {

        Scanner scan = new Scanner(System.in);
        boolean something = true;

        do {
            System.out.print("Please enter a number between 1 an 10: ");
            int entry = scan.nextInt();

            if (entry < min || entry > max){

            }
            else if (entry > min && entry < max) {
                something = false;
            }
        } while(something);
    }

}

