import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean game = true;
        Board4x4 board = new Board4x4();
        while(game){
            System.out.println("Welcome! \n If you want to play please select the board size below. ");
            System.out.println("Select option:\n 1 - 3x3 \n 2- 4x4");
            int input = Integer.parseInt(myObj.nextLine());
            // method
            switch (input) {
                case 0 -> System.out.println("Starting 3x3");
                case 1 -> board.shuffleBoard();
                case 2 -> board.printBoard();
                case 3 -> game = false;

            }
        }
    }
}
