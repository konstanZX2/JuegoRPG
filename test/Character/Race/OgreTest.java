package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OgreTest {
    Ogre ogre;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;

    @BeforeEach
    void setUp() {
        ogre = new Ogre();
        constitution = new Constitution(1);
        strength = new Strength(2);
        dexterity = new Dexterity(3);
        intelligence = new Intelligence(4);
    }

    @Test
    void modifierDexterity() {
        assertEquals(0, ogre.modifier(dexterity));
    }
    @Test
    void modifierStrength() {
        assertEquals(7, ogre.modifier(strength));
    }
    @Test
    void modifierConstitution() {
        assertEquals(8, ogre.modifier(constitution));
    }
    @Test
    void modifierIntelligence() {
        assertEquals(-10, ogre.modifier(intelligence));
    }
}