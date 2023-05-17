// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        getBoard();
    }
// Number 1
    public static void getBoard() {
        String [][] board = {{"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"}, {"W","B","W","B","W","B","W","B"}, {"B","W","B","W","B","W","B","W"} };//объявили массив и заполнили его элементами
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}