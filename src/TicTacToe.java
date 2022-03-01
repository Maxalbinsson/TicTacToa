import java.util.Scanner;

public class TicTacToe<i> {
    private static Scanner in;
    char[][] board;

    {
        board = new char[3][3];
    }

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
   
        }
        class scanner {
            final Scanner in = new Scanner(System.in);
		System.out.print("Spelare 1, vad är ditt namn? ");
            final String p1 = in.nextLine();
		System.out.print("Spelare 2, vad är ditt namn? ");
        String p2 = in.nextLine();
    }



}

}
