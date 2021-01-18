package squirrel;

import java.util.HashSet;
import java.util.List;

public class Helper {
    public static HashSet<String> journalEvents(List<DayJournal> journal) {
        HashSet<String> allEvents = new HashSet<String>();
        for (DayJournal dayJournal : journal) {
            allEvents.addAll(dayJournal.getEvents());
        }
        return allEvents;
    }

    public static double phi(int[] table) {
        return (table[3] * table[0] - table[2] * table[1]) /
                Math.sqrt((table[2] + table[3]) *
                        (table[0] + table[1]) *
                        (table[1] + table[3]) *
                        (table[0] + table[2]));
    }

    public static int[] tableFor(String event, List<DayJournal> journal) {
//        List<Integer> table = new ArrayList<>(4);
        int[] table = new int[4];

        for (DayJournal dayJournal : journal) {
            int index = 0;
            if (includes(event, dayJournal)) {
                index += 1;
            }
            if (dayJournal.isSquirrel()) {
                index += 2;
            }
            table[index] += 1;
        }
        return table;
    }

    public  static boolean includes(String event, DayJournal dayJournal) {
        for (String s : dayJournal.getEvents()) {
            if (s.equals(event)) {
                return true;
            }
        }
        return false;
    }
}
