package Character;

import Character.Job.Job;
import Character.Job.Mage;
import Character.Race.Ogre;
import Character.Race.Race;
import Character.Stat.*;
import Item.Food.Apple;
import Item.Food.Food;
import Item.IConsumable;


public class Player implements IDamageable {
    String name;
    Race race;
    Job job;
    Strength strength;
    Constitution constitution;
    Dexterity dexterity;
    Intelligence intelligence;
    private double dmg = 0;


    public Player(String name, Race race, Job job, Strength strength, Constitution constitution, Dexterity dexterity, Intelligence intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.constitution = constitution;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }

    public double velocity() {
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2;


    }

    public double power() {
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2;


    }

    public double magic() {
        return (intelligence.getValue() + race.modifier(dexterity) + race.modifier(strength) + race.modifier(intelligence) + race.modifier(constitution) + job.modifier(dexterity) + job.modifier(strength) + job.modifier(constitution) + job.modifier(intelligence)) * 2;


    }

    @Override
    public String toString() {
        return "My name is" + " " + name +
                " I'm an " + race +
                " " + job +
                ", strength: " + strength +
                ", constitution: " + constitution +
                ", dexterity: " + dexterity +
                ", intelligence: " + intelligence + " velocity: " + velocity() + " power: " + power() + " magic: " + magic() +
                '}';
    }


    @Override
    public double maxHealth() {
        return ((constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25);
    }

    @Override
    public double currentHealth() {

        return (maxHealth() - dmg);
    }

    @Override
    public boolean isDead() {
        return (currentHealth() <= 0);
    }

    @Override
    public void recievesDamage(double amount) {
        dmg += amount;
        System.out.println(name + " recieved " + dmg + " damage. Health: " + currentHealth() + " / " + maxHealth());


    }

    @Override
    public void heals(double amount) {
        if (amount >= dmg) {
            dmg = 0;
        } else {
            dmg -= amount;
        }
        System.out.println(name + " healed " + amount + " life. Health: " + currentHealth() + " / " + maxHealth());

    }

    public void consumes(IConsumable consumable) {


    }
}
