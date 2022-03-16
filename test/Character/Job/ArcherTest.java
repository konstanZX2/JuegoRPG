package Character.Job;

import Character.Race.Elf;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {
Archer archer;
Constitution constitution;
Strength strength;
Dexterity dexterity;
Intelligence intelligence;
    @BeforeEach
    void setUp() {
        archer = new Archer();
        constitution = new Constitution(-1);
        strength = new Strength(4);
        dexterity = new Dexterity(4);
        intelligence = new Intelligence(2);
    }


    @Test
    void modifierConstitution() {
        assertEquals(0,archer.modifier(constitution));

    }
    @Test
    void modifierStrength() {
        assertEquals(1,archer.modifier(strength));


    }
    @Test
    void modifierDexterity() {
        assertEquals(3,archer.modifier(dexterity));



    }
    @Test
    void modifierIntelligence() {
        assertEquals(1,archer.modifier(intelligence));



    }
}