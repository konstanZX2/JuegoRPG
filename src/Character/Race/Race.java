package Character.Race;

import Character.Stat.Stat;

public abstract class Race {



    public abstract int modifier(Stat stat);




    public boolean equals(Object obj){
return false;
    }

    @Override
    public String toString() {
        return "Race{}";
    }

}
