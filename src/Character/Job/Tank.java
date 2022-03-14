package Character.Job;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;

public class Tank extends Job {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution)
            return 5;
        return 0;
    }
}
