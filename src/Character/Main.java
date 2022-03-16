package Character;

import Character.Job.Mage;
import Character.Race.Ogre;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("dhgcujisdhck",new Ogre(),new Mage(),new Strength(5),new Constitution(5),new Dexterity(5),new Intelligence(5));
        System.out.println(player1);
    }
}
