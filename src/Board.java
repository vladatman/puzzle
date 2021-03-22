import java.awt.event.KeyEvent;

public abstract class Board {

    protected String size;  //3x3 or 4x4
    protected int[][] arr;

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void shuffleBoard();

    public void printBoard(){
        for (int[] ints : this.arr) {
            for (int anInt : ints) {
                if (anInt == 0) System.out.println("_\t");
                else System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public void keyReleased(KeyEvent e) {
        this.keyPressed(e);
    }

    public void keyPressed(KeyEvent e) {
        this.keyPressed(e);
    }
}
