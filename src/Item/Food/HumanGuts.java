package Item.Food;

public class HumanGuts extends Food{
    @Override
    public double getPower() {
        return super.getPower()+50;
    }
}
