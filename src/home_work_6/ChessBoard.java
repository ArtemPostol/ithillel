package home_work_6;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        System.out.println("Введите размерз доски: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        String chessBoard = chessBoardBuilder(size);
        System.out.println(chessBoard);
    }

    public static String chessBoardBuilder(int size) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (i % 2 != 0) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < size; j++) {
                stringBuilder.append("# ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
