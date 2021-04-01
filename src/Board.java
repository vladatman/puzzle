import java.awt.event.KeyEvent;

import static java.lang.Math.pow;

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
        StringBuilder strBuffer = new StringBuilder("");
        for (int[] ints : this.arr) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    StringBuilder append = strBuffer.append("_\t");
                } else strBuffer.append(anInt).append("\t");
            }
            strBuffer.append('\n');
        }
        return strBuffer.toString();
    }


    public boolean isSolved(){
        int counter = 1;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (counter == arr.length * arr.length) return true;
                if (anInt != counter) return false;
                counter++;
            }
        }
        return true;
    }
}
