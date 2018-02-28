import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        //Table of Powers
        Scanner scan = new Scanner(System.in);
        int good = 1;

        do {

            System.out.print("What number would you like to go up to? ");
            int entry = scan.nextInt();
            System.out.println();

            System.out.println("Here is your table!");
            System.out.println();

            System.out.println("number" + " | " + "squared" + " | " + "cubed");
            System.out.println("-----" + "  | " + "-------" + " | " + "-----");

            for (int i = 1; i <= entry; i++) {

                System.out.print(i + "      |");
                System.out.print(" " + i * i + "       |");
                System.out.println(" " + i * i * i);
            }
            scan.nextLine();

            System.out.print("Would you like to continue? y/n  ");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("n")) {
                good = 2;
            }
        } while (good == 1);

    }
}
