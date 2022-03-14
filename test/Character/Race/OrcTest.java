package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {
    Orc orc;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;
    @BeforeEach
    void setUp() {
        orc = new Orc();
        constitution = new Constitution(1);
        strength = new Strength(2);
        dexterity = new Dexterity(3);
        intelligence = new Intelligence(4);
    }

    @Test
    void modifierStrength() {
        assertEquals(5, orc.modifier(strength));
    }
    @Test
    void modifierDexterity() {
        assertEquals(0, orc.modifier(dexterity));
    }
    @Test
    void modifierConstitition() {
        assertEquals(3, orc.modifier(constitution));
    }
    @Test
    void modifierIntelligence() {
        assertEquals(-3, orc.modifier(intelligence));
    }

}