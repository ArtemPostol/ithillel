package squirrel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadJournal {
    public static List<DayJournal> loadJournal(String pathname) throws IOException {
        File file = new File(pathname);
        List<DayJournal> journal = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String str;
            while ((str = br.readLine()) != null) {
                List<String> columns = new ArrayList<>(Arrays.asList(str.split(",")));
                String s = columns.get(columns.size() - 1);
                columns.remove(columns.size()-1);
                DayJournal dayJournal = new DayJournal(columns);
                if (s.equals("true")){
                    dayJournal.setSquirrel(true);
                }
                journal.add(dayJournal);
            }
        }
       return journal;
    }
}
