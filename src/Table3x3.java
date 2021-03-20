public class Table3x3 extends Table{

    private int[][] arr;

    public Table3x3() {
        this.arr = new int[3][3];
        this.size = "3x3";
    }

    public int[][] getArr() {
        return this.arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }
}
