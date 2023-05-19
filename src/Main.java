import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        getBoard();
        getCountNumber();
    }

    // Number 0
    public static void getCountNumber() {
            int[][][] cube = new int[][][]{
                    {
                            {2, 4, 6},
                            {7, 9, 1},
                            {8, 3, 5}
                    }
            };
            for (int j = 0; j < cube.length; j++) {
                for (int y = 0; y < cube[j].length; y++) {
                    for (int z = 0; z < cube[j][y].length; z++) {
                        System.out.print( " - " + cube[j][y][z]);
                    }
                    System.out.println();
                }
            }
            Scanner enter = new Scanner(System.in);
            System.out.print("Please, enter your number: ");
            int increment = enter.nextInt();
            for (int j = 0; j < cube.length; j++) {
                for (int y = 0; y < cube[j].length; y++) {
                    for (int z = 0; z < cube[j][y].length; z++) {
                        cube[j][y][z] += increment;
                    }
                }
            }
            System.out.println("New array after change: ");
            for (int j = 0; j < cube.length; j++) {
                for (int y = 0; y < cube[j].length; y++) {
                    for (int z = 0; z < cube[j][y].length; z++) {
                        System.out.print(" - " + cube[j][y][z]);
                    }
                    {
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }

    // Number 1
    public static void getBoard() {
        String[][] board = {{"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}, {"W", "B", "W", "B", "W", "B", "W", "B"}, {"B", "W", "B", "W", "B", "W", "B", "W"}};//объявили массив и заполнили его элементами
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}



