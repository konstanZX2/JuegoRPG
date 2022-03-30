package Item.Food;

public class Chicken extends Food{
    @Override
    public double getPower() {
        return super.getPower()+25;
    }
}
