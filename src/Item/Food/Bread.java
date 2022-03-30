package Item.Food;

public class Bread extends Food{
    @Override
    public double getPower() {
        return super.getPower()+10;
    }
}
