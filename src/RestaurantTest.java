public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();

        dish.setNameOfDish("Pizza");
        dish.setCostInCents(150);
        dish.setWouldRecommend(true);

        System.out.println(dish.getNameOfDish());
        System.out.println(dish.getCostInCents());
        System.out.println(dish.isWouldRecommend());

        RestaurantDish dish2 = new RestaurantDish("Burger", 10, true);

        System.out.println(dish2.getNameOfDish());
        System.out.println(dish2.getCostInCents());
        System.out.println(dish2.isWouldRecommend());

//        dish.costInCents = 50;
//        dish.nameOfDish = "Ramen";
//        dish.wouldRecommend = true;
//
//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);
//        System.out.println(dish.eat());
    }
}
