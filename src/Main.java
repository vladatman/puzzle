import javax.swing.*;
import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        //Scanner scanner = new Scanner(System.in);
        boolean game = true;
        Board4x4 board = new Board4x4();
        Move move = new Move(board);

        JTextArea textArea = new JTextArea(board.getSize());
        textArea.setFont(new Font("monospaced", Font.PLAIN, 16));

        frame.add(textArea);
        board.shuffleBoard();
        textArea.setText(board.printBoard());

        frame.addKeyListener(new KeyInput(board,textArea));
        //textArea.append("Welcome! \n If you want to play please select the board size below. ");
        //textArea.append("Select option:\n 1 - 3x3 \n 2- 4x4");

        /*while(game){
            char input = scanner.nextLine().charAt(0);
            // method
            switch (input) {
                case '0' -> System.out.println("Starting 4x4");
                case '1' -> board.shuffleBoard();
                case '2' -> board.printBoard();
                case KeyEvent.VK_UP -> move.up();
                case KeyEvent.VK_DOWN-> move.down();
                case KeyEvent.VK_LEFT-> move.left();
                case KeyEvent.VK_RIGHT -> move.right();
                case '7' -> game = false;

            }
        }*/

    }
}
