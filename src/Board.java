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

    public String printBoard(){
        StringBuffer strBuffer = new StringBuffer("");
        for (int[] ints : this.arr) {
            for (int anInt : ints) {
                if (anInt == 0) strBuffer.append("_\t");
                else strBuffer.append(anInt + "\t");
            }
            strBuffer.append('\n');
        }
        return strBuffer.toString();
    }

    public void keyReleased(KeyEvent e) {
        this.keyPressed(e);
    }

    public void keyPressed(KeyEvent e) {
        this.keyPressed(e);
    }
}
