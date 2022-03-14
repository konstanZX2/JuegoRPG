package Character.Race;

import Character.Stat.*;

public class Ogre extends Race {

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return 7;
        if (stat instanceof Constitution)
            return 8;
        if (stat instanceof Intelligence)
            return -10;
        return 0;

    }
}
