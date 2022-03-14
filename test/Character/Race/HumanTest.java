package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human human;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;

    @BeforeEach
    void setUp() {
        human = new Human();
        constitution = new Constitution(1);
        strength = new Strength(2);
        dexterity = new Dexterity(3);
        intelligence = new Intelligence(4);
    }


    @Test
    void modifierConstitution() {
        assertEquals(2, human.modifier(constitution));
    }


    @Test
    void modifierStrength() {
        assertEquals(2, human.modifier(strength));

    }


    @Test
    void modifierDexterity() {
        assertEquals(1, human.modifier(dexterity));


    }


    @Test
    void modifierIntelligence() {
        assertEquals(0, human.modifier(intelligence));


    }


}