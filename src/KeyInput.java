import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyInput implements KeyListener {

    private Board board;
    private JFrame frame;
    private JTextArea textArea;
    Move move;

    public KeyInput (Board board, JTextArea textArea, JFrame frame) {
        this.textArea = textArea;
        this.board = board;
        this.frame = frame;
        this.move = new Move(board);
    }
    public KeyInput (Board board) {
        this.board = board;
        this.move = new Move(board);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //new key has been pressed
        int key = e.getKeyCode();

        //pressing the right arrow
        if(key == KeyEvent.VK_RIGHT){
        }

        //pressing the left arrow
        else if(key == KeyEvent.VK_LEFT){
        }

        //pressing the up arrow
        else if(key == KeyEvent.VK_UP){
        }

        //pressing the down arrow
        else if(key == KeyEvent.VK_DOWN){
        }

    }

    public void keyReleased(KeyEvent e){
        //new key had been released
        int key = e.getKeyCode();

        //releasing the right arrow
        if(key == KeyEvent.VK_RIGHT){
            System.out.println("The right arrow key is released");
            move.right();
            if(board.isSolved()) frame.removeKeyListener(this);
        }

        //releasing the left arrow
        else if(key == KeyEvent.VK_LEFT){
            System.out.println("The left arrow key is released");
            move.left();
            if(board.isSolved()) frame.removeKeyListener(this);
        }

        //releasing the up arrow
        else if(key == KeyEvent.VK_UP){
            System.out.println("The up arrow key is released");
            move.up();
            if(board.isSolved()) frame.removeKeyListener(this);
        }

        //releasing the down arrow
        else if(key == KeyEvent.VK_DOWN){
            System.out.println("The down arrow key is released");
            move.down();
            if(board.isSolved()) frame.removeKeyListener(this);
        }

        textArea.setText(board.printBoard());
    }
}
