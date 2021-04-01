import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Board4x4Test {

    @Test
    void ShuffleBoard(){
        Board4x4 board1 = new Board4x4();
        board1.shuffleBoard();
        Board4x4 board2 = new Board4x4();
        board2.shuffleBoard();
        assertNotEquals(board1.arr, board2);
    }
}
