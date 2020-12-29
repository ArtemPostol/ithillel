package home_work_8;


public class TwoDimensionalArray1 {
    public static void main(String[] args) {

        int row = 6;
        int column = 9;
        int maxValue = -99;
        int minValue = 99;

        int[][] randomArray = randomArrayFilling(row, column, minValue, maxValue);
        displayByChessPattern(randomArray);
        System.out.println(getMaxValue(randomArray));
    }

    public static int[][] randomArrayFilling(int row, int column, int minValue, int maxValue) {
        int[][] multiplyTab = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                multiplyTab[i][j] = (int) (Math.random() * (maxValue - minValue) + minValue);
            }
        }
        return multiplyTab;
    }

    public static void displayByChessPattern(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxValue(int[][] array) {
        int maxValue = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] > maxValue) {
                    maxValue = array[j][i];
                }
            }
        }
        return maxValue;
    }
}
