package squirrel;

import java.io.IOException;
import java.util.*;

import static squirrel.Helper.includes;
import static squirrel.Helper.journalEvents;
import static squirrel.Helper.phi;
import static squirrel.Helper.tableFor;

public class Squirrel {
    public static void main(String[] args) throws IOException {
        String filename = "/Users/artem/hillel/java-hello/src/com/hillel/journalEvents_ru.csv";
        LoadJournal.loadJournal(filename);
        List<DayJournal> journal = LoadJournal.loadJournal(filename);
        for (DayJournal dayJournal : journal) {
            System.out.println(dayJournal.toString());
        }

        int[] tableForPizza = tableFor("ел пиццу", journal);
        System.out.println(Arrays.toString(tableForPizza));


        System.out.println("phi (pizza) = " + phi(tableForPizza));
        HashSet<String> allEvents = journalEvents(journal);

        for (String event : allEvents) {
            System.out.printf("%-21s: %1.9f", event, phi(tableFor(event, journal)));
            System.out.println();
        }

        System.out.println("\nДля корреляции > 0.1 или < -0.1");
        for (String event : allEvents) {
            double correlation = phi(tableFor(event, journal));
            if (correlation > 0.1 || correlation < -0.1) {
                System.out.printf("%-21s: %1.9f", event, correlation);
                System.out.println();
            }
        }

        String eventPeanutsTeeth = "арахис-зубы";
        for (DayJournal dayJournal : journal) {
            for (int i = 0; i < dayJournal.getEvents().size(); i++) {
                if (includes("ел арахис", dayJournal) && !includes("чистил зубы", dayJournal)) {
                    dayJournal.getEvents().set(i, eventPeanutsTeeth);
                }
            }
        }

        System.out.println("\nДля нового события");
        System.out.printf("%-21s: %1.9f", eventPeanutsTeeth, phi(tableFor(eventPeanutsTeeth, journal)));
        System.out.println();
    }
}
