public class ControlFlowExercises {
    public static void main(String[] args) {
//        int counter = 0;

//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);

//        int counter = 100;
////
////        do {
////            System.out.println(counter);
////            counter -= 5;
////        } while (counter >= -10);

        long counter = 2;

        do {
            System.out.println(counter);
            counter *= counter;
        } while (counter <= 1000000);
    }
}
