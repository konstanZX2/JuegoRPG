package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;

public class Mage extends Job {
    @Override
    public int modifier(Stat stat) {

        if (stat instanceof Dexterity)
            return 1;
        if (stat instanceof Intelligence)
            return 4;
        return 0;
    }
}