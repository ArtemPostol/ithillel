package challenges;

public class Switch {
    public static void main(String[] args) {
        int maxValue = 6;
        int minValue = 1;
        int random = (int) (Math.random() * (maxValue - minValue) + minValue);

        String message = null;
        switch (random) {
            case 1:
                message = "Передвинтесь на один шаг вперед - это нечетное число";
                break;
            case 2:
                message = "Передвинтесь на два шага вперед - это четное число";
                break;
            case 3:
                message = "Передвинтесь на три шага вперед - это нечетное число";
                break;
            case 4:
                message = "Передвинтесь на четыре шага вперед - это четное число";
                break;
            case 5:
                message = "Передвинтесь на пять шагов вперед - это нечетное число";
                break;
            case 6:
                message = "Передвинтесь на шесть шагов вперед - это четное число";
                break;
        }
        System.out.println(message);

//        boolean evenNumber = isEvenNumber(random);
//        String isEvenNumberMessage = isEvenNumber(evenNumber);
//
//        System.out.println(evenNumber);
//        System.out.println(isEvenNumberMessage);

    }

    public static boolean isEvenNumber(int random){
        return random % 2 == 0;
    }

    public static String isEvenNumber(boolean evenNumber){
        return evenNumber ? "это четное число" : "это нечетное число";
    }
}
