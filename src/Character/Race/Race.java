package Character.Race;

import Character.Stat.Stat;

public abstract class Race {
    public abstract int modifier(Stat stat);

    public boolean equals(Object obj) {
        if (obj == null) return false;
        return this.getClass() == obj.getClass();
    }

    @Override
    public String toString() {
        return "Race{}";
    }

}
