package Character.Race;

import Character.Stat.Dexterity;
import Character.Stat.Stat;

public class Elf extends Race{


    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return 3;
        if (stat instanceof Dexterity)
            return 3;
        if(stat instanceof Dexterity)
            return 3;
        return 0;

    }
}
