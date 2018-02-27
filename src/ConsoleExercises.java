import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

//Exercise 1.
        int userInput;
        System.out.print("Please enter a number: ");
        userInput = ip.nextInt();

        System.out.println("You entered: \"" + userInput + "\"");

//Exercise 2.
        String wordOne;
        String wordTwo;
        String wordThree;

        System.out.println("Please enter 3 words: ");
        wordOne = ip.next();
        wordTwo = ip.next();
        wordThree = ip.next();

        System.out.println("Your first word was: " + wordOne);
        System.out.println("You second word was: " + wordTwo);
        System.out.println("You third word was: " + wordThree);

        ip.nextLine();

//Exercise 3.
        String newUserInput;

        System.out.println("Please enter a sentence: ");

        newUserInput = ip.nextLine();

        System.out.println("Your sentence was: " + newUserInput);

//Exercise 4.

    double length;
    double width;
    double height;

        System.out.println("Please enter the length, in feet: ");
        length = ip.nextDouble();
        System.out.println("Please enter the width, in feet: ");
        width = ip.nextDouble();
        System.out.println("Please enter the height, in feet: ");
        height = ip.nextDouble();


        System.out.println("The area of the classroom is: " + (length * width) + "ft");
        System.out.println("The perimeter of the classroom is: " + ((2 * length) + (2 * width)) + "ft");
        System.out.println("The volume of the classroom is: " + (length * width * height) + "ft");

    }
}
