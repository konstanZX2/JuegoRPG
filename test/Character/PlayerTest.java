package Character;

import Character.Job.JobMock;
import Character.Job.Mage;
import Character.Race.Ogre;
import Character.Race.RaceMock;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player player;
    RaceMock racemock = new RaceMock();
    JobMock jobmock = new JobMock();
    Strength strength = new Strength(1);
    Constitution constitution = new Constitution(1);
    Dexterity dexterity = new Dexterity(1);
    Intelligence intelligence = new Intelligence(1);



    @BeforeEach
    void setUp() {
        player = new Player("a", racemock, jobmock, strength, constitution, dexterity, intelligence);

    }

    @Test
    void getName() {
        assertEquals("a",player.getName());

    }

    @Test
    void getRace() {
        assertEquals(racemock,player.getRace());
    }

    @Test
    void getJob() {
        assertEquals(jobmock, player.getJob());
    }

    @Test
    void velocity() {
        double velocity =(dexterity.getValue()+ racemock.modifier(dexterity)+ jobmock.modifier(dexterity))*2;
        assertEquals(velocity, player.velocity());

    }

    @Test
    void power() {
        double power =(strength.getValue()+ racemock.modifier(strength)+ jobmock.modifier(strength))*2;
        assertEquals(power,player.power());
    }

    @Test
    void magic() {
        double magic = (intelligence.getValue()+ racemock.modifier(intelligence)+ jobmock.modifier(intelligence))*2;
        assertEquals(magic,player.magic());
    }
}