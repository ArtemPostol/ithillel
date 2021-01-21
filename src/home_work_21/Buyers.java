package home_work_21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Buyers {
    public static TreeMap<String, TreeMap<String, Integer>> loadBuyers(String filename) throws IOException {
        File file = new File(filename);
        TreeMap<String, TreeMap<String, Integer>> buyers = new TreeMap<String, TreeMap<String, Integer>>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String str;
            while ((str = br.readLine()) != null) {

                String[] parts = str.split(" ");

                String name = parts[0];
                String productName = parts[1];
                Integer count = Integer.parseInt(parts[2]);

                if (!buyers.containsKey(name))
                    buyers.put(name, new TreeMap<String, Integer>());

                TreeMap<String, Integer> temp = buyers.get(name);

                if (!temp.containsKey(productName))
                    temp.put(productName, 0);

                Integer oldCount = temp.get(productName);

                temp.put(productName, oldCount + count);
            }
            return buyers;
        }
    }

    public static String purchasesByBuyers(TreeMap<String, TreeMap<String, Integer>> buyers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, TreeMap<String, Integer>> entry : buyers.entrySet()) {
            String key = entry.getKey();
            TreeMap<String, Integer> value = entry.getValue();
            stringBuilder.append(key).append(":");
            stringBuilder.append('\n');

            for (Map.Entry<String, Integer> product : value.entrySet()) {
                String keyProduct = product.getKey();
                Integer valueProduct = product.getValue();
                stringBuilder.append(keyProduct).append(" ").append(valueProduct);
                stringBuilder.append('\n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
