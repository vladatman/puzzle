import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

    private Board board;

    public KeyInput (Board board) {
        this.board = board;
    }

    public void KeyPressed(KeyEvent e){
        //new key has been pressed
        int key = e.getKeyCode();

        //pressing the right arrow
        if(key == KeyEvent.VK_RIGHT){
            System.out.println("The right arrow key is pressed");
        }

        //pressing the left arrow
        else if(key == KeyEvent.VK_LEFT){
            System.out.println("The left arrow key is pressed");
        }

        //pressing the up arrow
        else if(key == KeyEvent.VK_UP){
            System.out.println("The up arrow key is pressed");
        }

        //pressing the down arrow
        else if(key == KeyEvent.VK_DOWN){
            System.out.println("The down arrow key is pressed");
        }
    }

    public void keyReleased(KeyEvent e){
        //new key had been released
        int key = e.getKeyCode();

        //releasing the right arrow
        if(key == KeyEvent.VK_RIGHT){
            System.out.println("The right arrow key is released");
        }

        //releasing the left arrow
        else if(key == KeyEvent.VK_LEFT){
            System.out.println("The left arrow key is released");
        }

        //releasing the up arrow
        else if(key == KeyEvent.VK_UP){
            System.out.println("The up arrow key is released");
        }

        //releasing the down arrow
        else if(key == KeyEvent.VK_DOWN){
            System.out.println("The down arrow key is released");
        }
    }
}
