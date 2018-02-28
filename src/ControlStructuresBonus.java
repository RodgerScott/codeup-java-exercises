import java.util.Scanner;

public class ControlStructuresBonus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

// 1. Prompt the user to enter an integer between 1 and 7 and output
// the day of the week it maps to (Sunday is 1 and Saturday is 7)

//        System.out.print("Please enter an integer between 1 and 7: ");
//        int entry = scan.nextInt();
//
//        switch(entry) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }


//  2. Prompt the user for an integer.
//  Output whether or not the number is prime.

//        System.out.print("Please enter an integer: ");
//        int entry = scan.nextInt();
//
//        if (entry == 2 || entry == 3 || entry == 5) {
//            System.out.println("prime");
//        }
//        else if (entry % 2 == 0 || entry % 3 == 0 || entry % 5 == 0) {
//            System.out.println("not prime");
//        }
//        else {
//            System.out.println("prime");
//        }


//  3. Prompt the user to enter an integer and output all the days of the week that
//  have no more letters than the integer given.

        System.out.print("Please pick an integer: ");
        int selection = scan.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < days.length; i++) {
            if (selection >= days[i].length()) {
                System.out.println(days[i]);
            }
        }

    }
}
