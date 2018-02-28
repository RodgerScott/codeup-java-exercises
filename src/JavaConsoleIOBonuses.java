import java.util.Scanner;

public class JavaConsoleIOBonuses {
    public static void main(String[] args) {


// BONUS 1
// Prompt the user to enter a favorite quote
// Output the quote
// Ask them to enter how many words are in the sentence
// Output the number they entered

        Scanner scan = new Scanner(System.in).useDelimiter(",");

//        System.out.println("Please enter your favorite quote below: ");
//        String quote = scan.nextLine();
//
//        System.out.println(quote);
//        System.out.println();
//
//        System.out.println("How many words do you think are in the sentence?");
//        int totalWords = scan.nextInt();
//
//        System.out.println();
//
//        System.out.println(totalWords);


// BONUS 2
// Prompt the user to enter a list of top three favorite foods separated by only spaces
// Use the printf() to output there three top foods with the format:
// 1) FirstFood
// 2) SecondFood
// 3) ThirdFood

//        System.out.print("Please enter your 3 favorite foods: ");
//        String firstFood = scan.next();
//        String secondFood = scan.next();
//        String thirdFood = scan.next();
//
//        System.out.printf("1) %s%n", firstFood);
//        System.out.printf("2) %s%n", secondFood);
//        System.out.printf("3) %s%n", thirdFood);



// BONUS 3
// Prompt the user to enter a grocery list of three items
// Each item should only be separated by a comma (no spaces)
// You will need to use the .useDelimiter() method on your scanner object
// Output the result as a comma-separated list using printf()
        System.out.print("Please enter a grocery list of 3 items: ");
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();

        System.out.printf("%s,", first);
        System.out.printf("%s,", second);
        System.out.printf("%s,", third);

    }
}
