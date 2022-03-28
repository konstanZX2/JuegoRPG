package Character;

public interface IDamageable {
    double maxHealth();
    double health();
    boolean isDead();
    void recievesDamage(double amount);
    void heals(double amount);
}
