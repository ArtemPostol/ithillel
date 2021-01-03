package home_work_15_2;


import static home_work_15_2.AnimalFactory.getAnimalByKey;

public class Main {
    public static void main(String[] args) {
        String da = getAnimalByKey(Scanner.input()).getName();
        System.out.println(da);
    }
}
