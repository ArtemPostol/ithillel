package home_work_21;

import java.io.IOException;
import java.util.TreeMap;

public class MainShop {
    public static void main(String[] args) throws IOException {
        String filename = "src/home_work_21/purcheses.csv";
        TreeMap<String, TreeMap<String, Integer>> buyers = Buyers.loadBuyers(filename);
        System.out.println(Buyers.purchasesByBuyers(buyers));
    }
}
