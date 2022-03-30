package Item.Food;

public class Apple extends Food{
    @Override
    public double getPower() {
        return super.getPower()+5;
    }
}
