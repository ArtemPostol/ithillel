package home_work_8;

import static home_work_8.TwoDimensionalArray1.displayByChessPattern;
import static home_work_8.TwoDimensionalArray1.randomArrayFilling;

public class TwoDimensionalArray3 {
    public static void main(String[] args) {
        int row = 3;
        int column = 5;
        int maxValue = 0;
        int minValue = 9;

        int[][] randomArray = randomArrayFilling(row, column, minValue, maxValue);
        revert2DArray(randomArray);
        displayByChessPattern(randomArray);
    }

    public static void revert2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int min = array[i][j];
                int minId = i;

                if (array[i][j] < min) {
                    min = array[i][j];
                    minId = j;
                }
                int temp = array[i][j];
                array[i][j] = min;
                array[i][minId] = temp;
            }
        }
    }
}
