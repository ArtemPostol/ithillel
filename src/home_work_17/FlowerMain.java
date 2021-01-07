package home_work_17;

public class FlowerMain {
    public static void main(String[] args) {
        int flowersCount = Scanner.input();
        Bouquet bouquet = new Bouquet(flowersCount);
        System.out.println(bouquet.toString());
    }
}
