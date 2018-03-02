public class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish() {}

    public RestaurantDish(String name, int cost, boolean good) {
        this.nameOfDish = name;
        this.costInCents = cost;
        this.wouldRecommend = good;
    }

    public String eat() {
        return "Nom nom nom!";
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
