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
                if (entry > 76) {
                    System.out.println("+");
                }
                if (entry < 69) {
                    System.out.println("-");
                } else {
                    System.out.println();
                }
            }
            if (entry <= 89 && entry > 79) {
                System.out.println("You got a B");
                if (entry > 87) {
                    System.out.println("+");
                }
                if (entry < 83) {
                    System.out.println("-");
                } else {
                    System.out.println();
                }
            }
            if (entry <= 100 && entry > 89) {
                System.out.print("You got an A");
                if (entry > 97) {
                    System.out.println("+");
                }
                if (entry < 93) {
                    System.out.println("-");
                } else {
                    System.out.println();
                }

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
