public class ControlFlowExercises {
    public static void main(String[] args) {

        //Fizzbuzz

        for (int i = 0; i <= 100; i++) {
            if ( i % 3 == 0 && i % 15 != 0) {
                System.out.println("fizz");
            }
            else if ( i % 5 == 0 && i % 15 != 0) {
                System.out.println("Buzz");
            }
            else if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
