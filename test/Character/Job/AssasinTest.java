package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssasinTest {
    Assasin assasin;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;
    @BeforeEach
    void setUp() {
        assasin = new Assasin();
        constitution = new Constitution(-1);
        strength = new Strength(4);
        dexterity = new Dexterity(4);
        intelligence = new Intelligence(2);



    }

    @Test
    void modifierConstitution() {
        assertEquals(1,assasin.modifier(constitution));


    }
    @Test
    void modifierStrength() {
        assertEquals(1,assasin.modifier(strength));


    }
    @Test
    void modifierDexterity() {
        assertEquals(3,assasin.modifier(dexterity));



    }
    @Test
    void modifierIntelligence() {
        assertEquals(0,assasin.modifier(intelligence));



    }
}