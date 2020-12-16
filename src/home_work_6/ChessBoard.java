package home_work_6;

import java.util.Scanner;

public class ChessBoard {

    public static void main(String[] args) {
        System.out.println("Введите размер доски: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        String chessBoard = chessBoardBuilder(size);
        System.out.println(chessBoard);
    }

    public static String chessBoardBuilder(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    stringBuilder.append(' ');
                } else {
                    stringBuilder.append('#');
                }
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
