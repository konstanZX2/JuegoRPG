package Character;

public interface IDamageable {
    double maxHealth();
    double currentHealth();
    boolean isDead();
    void recievesDamage(double amount);
    void heals(double amount);
}
