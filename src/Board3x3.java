import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board3x3 extends Board{

    public Board3x3() {
        this.arr = new int[3][3];
        this.size = "3x3";
    }

    public int[][] getArr() {
        return this.arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public void shuffleBoard(){
        // generate a List that contains the numbers 0 to 9
        List<Integer> digits = IntStream.range(1,9).boxed().collect(Collectors.toList());
        //Shuffle
        Collections.shuffle (digits);

        int counter = 0;
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if(counter <= 7) {
                    this.arr[i][j] = digits.get(counter);
                    counter++;
                }
            }
        }
    }


}
