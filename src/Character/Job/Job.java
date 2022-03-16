package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    public abstract int modifier(Stat stat);

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        return this.getClass() == obj.getClass();
    }

    public String toString(){
        return getClass().getSimpleName();
    }

    }

