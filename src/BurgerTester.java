public class BurgerTester {
    public static void main(String[] args) {


        BurgerTools.mostPopularTopping = "Onions";
        BurgerTools.averageDaysBeforeExpiration = 14;
        BurgerTools.temperatureWhenCooked = 355;


        System.out.println("The most popular topping is: " + BurgerTools.mostPopularTopping);
        System.out.println("The average days before expiring is: " + BurgerTools.averageDaysBeforeExpiration);
        System.out.println("The temperature when cooked will be: " + BurgerTools.temperatureWhenCooked);
        BurgerTools.grill();
    }
}
