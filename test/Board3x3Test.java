import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class Board3x3Test {

    @Test
    void ShuffleBoard(){
        Board3x3 board1 = new Board3x3();
        board1.shuffleBoard();
        Board3x3 board2 = new Board3x3();
        board2.shuffleBoard();
        assertNotEquals(board1.arr, board2);
    }
}
