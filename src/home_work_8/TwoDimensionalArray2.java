package home_work_8;

import static home_work_8.TwoDimensionalArray1.randomArrayFilling;

public class TwoDimensionalArray2 {
    public static void main(String[] args) {
        int row = 7;
        int column = 5;
        int minValue = -5;
        int maxValue = 5;
        int[][] randomArray = randomArrayFilling(row, column, minValue, maxValue);
        int maxIndex = getMaxIndex(randomArray);
        System.out.println(maxIndex);
    }

    public static int getMaxIndex(int[][] array) {
        int index = -1;
        int res = 1;
        if (array != null)
            for (int i = 0; i < array.length; i++) {
                int temp = 1;
                for (int j = 0; j < array[i].length; j++) {
                    temp *= Math.abs(array[i][j]);
                }
                if (temp >= res) {
                    index = i;
                    res = temp;
                }
            }
        return index;
    }

}
