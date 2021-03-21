import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board4x4 extends Board{

    private int[][] arr;

    public Board4x4() {
        this.arr = new int[4][4];
        this.size = "4x4";
    }

    public int[][] getArr() {
        return this.arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void shuffleBoard(){
        // generate a List that contains the numbers 0 to 9
        List<Integer> digits = IntStream.range(1,16).boxed().collect(Collectors.toList());
        //Shuffle
        Collections.shuffle (digits);

        int counter = 0;
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if(counter <= 14) {
                    this.arr[i][j] = digits.get(counter);
                    counter++;
                }
            }
        }
    }

    public void printBoard(){
        for (int[] ints : this.arr) {
            for (int anInt : ints) {
                if (anInt == 0) System.out.println("_\t");
                else System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
