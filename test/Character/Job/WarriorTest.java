package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior warrior;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;

    @BeforeEach
    void setUp() {

        warrior = new Warrior();
        constitution = new Constitution(-1);
        strength = new Strength(4);
        dexterity = new Dexterity(4);
        intelligence = new Intelligence(2);
    }

    @Test
    void modifierConstitution() {
        assertEquals(2,warrior.modifier(constitution));

    }

    @Test
    void modifierStrength() {
        assertEquals(3,warrior.modifier(strength));


    }
    @Test
    void modifierDexterity() {
        assertEquals(0,warrior.modifier(dexterity));



    }
    @Test
    void modifierIntelligence() {
        assertEquals(0,warrior.modifier(intelligence));



    }

}