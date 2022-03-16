package Character.Job;

import Character.Stat.*;

public class Assasin extends Job {

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution)
            return 1;
        if (stat instanceof Dexterity)
            return 3;
        if (stat instanceof Strength)
            return 1;
        return 0;
    }
}
