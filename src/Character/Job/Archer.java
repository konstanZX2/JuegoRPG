package Character.Job;

import Character.Stat.*;

public class Archer extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return 3;
        if (stat instanceof Intelligence)
            return 1;
        if(stat instanceof Strength)
            return 1;
        return 0;
    }
}
