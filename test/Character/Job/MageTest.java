package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {
    Mage mage;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;

    @BeforeEach
    void setUp() {
        mage = new Mage();
        constitution = new Constitution(-1);
        strength = new Strength(4);
        dexterity = new Dexterity(4);
        intelligence = new Intelligence(2);
    }

    @Test
    void modifierConstitution() {
        assertEquals(0,mage.modifier(constitution));


    }
    @Test
    void modifierStrength() {
        assertEquals(0,mage.modifier(strength));


    }
    @Test
    void modifierDexterity() {
        assertEquals(1,mage.modifier(dexterity));



    }
    @Test
    void modifierIntelligence() {
        assertEquals(4,mage.modifier(intelligence));



    }


}