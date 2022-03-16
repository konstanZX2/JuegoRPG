package Character.Stat;

public abstract class Stat {
    public int value;

    public int getValue() {
        return value;
    }

    public Stat(int initialValue) {
        this.value = initialValue;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    @Override
    public String toString() {
        return  ""+value +"";
    }
}
