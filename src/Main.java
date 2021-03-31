import java.io.IOException;
        import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Board board;
        Scanner scanner = new Scanner(System.in);
        String input;
        Move move;
        do {
            System.out.println("Welcome! \nIf you want to play please select the board size below. ");
            while (true) {
                System.out.println("Select option:\n 1 - 3x3 \n 2- 4x4");
                input = scanner.next();
                if (input.equals("1")) {
                    board = new Board3x3();
                    break;
                } else if (input.equals("2")) {
                    board = new Board4x4();
                    break;
                } else System.out.println("Wrong command. Please, try again.");
            }

            System.out.println("Shuffling board...");
            board.shuffleBoard();
            //board.arr = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 0}};
            move = new Move(board);
            showHelp();
            System.out.println(board.printBoard());
            input = scanner.nextLine();

            while (!board.isSolved()) {

                input = scanner.nextLine();
                switch (input) {
                    case "w", "up" -> move.up();
                    case "s", "down" -> move.down();
                    case "a", "left" -> move.left();
                    case "d", "right" -> move.right();
                    case "h", "help" -> showHelp();
                    case "e", "exit" -> {
                        return;
                    }
                    default -> System.out.println("Wrong command. Please, try again.");
                }
                System.out.println(board.printBoard());
            }

            while (true) {

                System.out.println("""
                        You won.
                        Do you want to play again?
                        1 -> Yes
                        2 -> No""");
                input = scanner.next();
                if (input.equals("1")) {
                    break;
                } else if (input.equals("2")) {
                    return;
                } else {
                    System.out.println("Wrong command. Please, try again.");
                }
            }
        } while (true);
    }

    public static void showHelp() {
        System.out.println("""
                List of commands:
                \t'w' or 'up'\t\tto move UP
                \t's' or 'down'\tto move DOWN
                \t'd' or 'right'\tto move RIGHT
                \t'a' or 'left'\tto move LEFT
                \t'h' or 'help'\tto show HELP
                \t'r' or 'exit'\tto EXIT
                """);
    }

}
