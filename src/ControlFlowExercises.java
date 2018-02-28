import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        //Grade Conversions
        Scanner scan = new Scanner(System.in);

        int yo = 1;

        do {

            System.out.print("What is your numeric grade? ");
            int entry = scan.nextInt();

            if (entry <= 59) {
                System.out.println("You got an F");
            }
            if (entry <= 66 && entry > 59) {
                System.out.println("You got a D");
            }
            if (entry <= 79 && entry > 66) {
                System.out.println("You got a C");
            }
            if (entry <= 87 && entry > 79) {
                System.out.println("You got a B");
            }
            if (entry <= 100 && entry > 87) {
                System.out.println("You got an A");
            }

            scan.nextLine();

            System.out.print("Would you like to continue? y/n  ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                yo = 2;
            }

        } while(yo == 1);

    }
}
