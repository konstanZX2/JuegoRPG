package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {
    Elf elf;
    Constitution constitution;
    Strength strength;
    Dexterity dexterity;
    Intelligence intelligence;

    @BeforeEach
    void setUp() {
        elf = new Elf();
        constitution = new Constitution(-1);
        strength = new Strength(4);
        dexterity = new Dexterity(4);
        intelligence = new Intelligence(2);
    }

    @Test
    void modifierStrenght() {
        assertEquals(0, elf.modifier(strength));

    }

    @Test
    void modifierDexterity() {
        assertEquals(3, elf.modifier(dexterity));

    }

    @Test
    void modifierConstitution() {
        assertEquals(-1, elf.modifier(constitution));

    }

    @Test
    void modifierIntelligence() {
        assertEquals(3, elf.modifier(intelligence));

    }


}