package Item.Food;

public class HumanHead extends Food{
    @Override
    public double getPower() {
        return super.getPower()+70;
    }
}
