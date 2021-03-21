public abstract class Board {

    protected String size;  //3x3 or 4x4

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void shuffleBoard();

    public abstract void printBoard();
}
