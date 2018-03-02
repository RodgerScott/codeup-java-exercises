public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();

        dish.costInCents = 50;
        dish.nameOfDish = "Ramen";
        dish.wouldRecommend = true;

        System.out.println(dish.costInCents);
        System.out.println(dish.nameOfDish);
        System.out.println(dish.wouldRecommend);
        System.out.println(dish.eat());
    }
}
