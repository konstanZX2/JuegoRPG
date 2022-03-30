package Item.Food;
import Character.Player;
import Item.IConsumable;

public abstract class Food implements IConsumable {
    public Food(double power) {
        this.power = power;
    }

    public double power=0;

    public double getPower() {
        return power;
    }

    @Override
    public void consumedBy(Player player) {

    }
}
