package squirrel;

import java.util.List;

public class DayJournal {
    private List<String> events;
    private boolean squirrel;

    public List<String> getEvents() {
        return events;
    }

    public boolean isSquirrel() {
        return squirrel;
    }

    public void setSquirrel(boolean squirrel) {
        this.squirrel = squirrel;
    }

    public DayJournal(List<String> events) {
        this.events = events;
    }



    @Override
    public String toString() {
        return getEvents().toString() + isSquirrel();
    }
}
