package body_mass_index;

public class BodyMassIndex {

    public static double calculateBodyMassIndex(double weight, double height) {
        double massBodyIndex = (weight / Math.pow(height, 2));
        return (double) Math.round(massBodyIndex * 100) / 100; //math rounding to two digits after point
    }

    public static String interpretation(double bodyMassIndex) {
        String message;
        if (bodyMassIndex < 16) {
            message = "Выраженный дефицит массы тела";
        } else if (bodyMassIndex >= 16 && bodyMassIndex < 18.5) {
            message = "Недостаточная (дефицит) масса тела";
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            message = "Норма";
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            message = "Ожирение";
        } else if (bodyMassIndex >= 35 && bodyMassIndex < 40) {
            message = "Ожирение резкое";
        } else message = "Очень резкое ожирение";
        return message;
    }

    public static void printResult(String name, double weight, double height, double bmi) {
        System.out.println(name + ", ваш вес: " + weight + " кг;");
        System.out.println("ваш рост: " + height + " м;");
        System.out.println("ваш индекс массы тела: " + bmi + " кг/м²;");
        System.out.println("соответствие между массой и ростом: " + interpretation(bmi));
    }
}
