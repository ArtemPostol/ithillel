package home_work_7;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Сумма элементов в массиве " + calculateArraySum(myArray));
        System.out.println("Среднее значение в массиве " + calculateArrayAverage(myArray));
        System.out.println("Максимальное значение масива " + maxArrayValue(myArray));
        revertArray(myArray);
        System.out.println("Перевернутый массив " + Arrays.toString(myArray));
        int[] ints = addNumberToArray(myArray, 10);
        System.out.println("Увеличенный массив " + Arrays.toString(ints));

    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return sum;
    }

    public static double calculateArrayAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }
        return (double) sum / (array.length);
    }

    public static int maxArrayValue(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void revertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public static int[] addNumberToArray(int[] array, int number){
        int[] result = Arrays.copyOf(array, array.length + 1); //не уверен, что правильно понял задание;
        result[array.length] = number;
        return result;
    }
}
