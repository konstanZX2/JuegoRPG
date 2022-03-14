package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LycanthropeTest {
    Lycanthrope lycanthrope;
    Constitution constitution;
    Strength strength;
    Intelligence intelligence;
    Dexterity dexterity;

    @BeforeEach
    void setUp() {
        lycanthrope = new Lycanthrope();
        constitution = new Constitution(1);
        strength = new Strength(2);
        dexterity = new Dexterity(3);
        intelligence = new Intelligence(4);
    }

    @Test
    void modifierConstitution() {
        assertEquals(1,lycanthrope.modifier(constitution));

    }
    @Test
    void modifierStrength() {
        assertEquals(2,lycanthrope.modifier(strength));

    }
    @Test
    void modifierDexterity() {
        assertEquals(1,lycanthrope.modifier(dexterity));

    }
    @Test
    void modifierIntelligence() {
        assertEquals(1,lycanthrope.modifier(intelligence));

    }


}