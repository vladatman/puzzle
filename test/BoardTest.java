import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board3x3 board3x3;
    Board4x4 board4x4;

    @BeforeEach
    void setup(){
        board3x3 = new Board3x3();
        board4x4 = new Board4x4();
    }

    @Test
    void printBoard3x3() {
        board3x3.arr = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 0}};
        String output = new String("1\t2\t3\t\n" +
                "4\t5\t6\t\n" +
                "7\t8\t_\t\n");
        assertEquals(output, board3x3.printBoard());
    }

    @Test
    void printBoard4x4() {
        board4x4.arr = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 0}};
        String output = new String("1\t2\t3\t4\t\n" +
                "5\t6\t7\t8\t\n" +
                "9\t10\t11\t12\t\n" +
                "13\t14\t15\t_\t\n");
        assertEquals(output, board4x4.printBoard());
    }

    @Test
    void isSolvedBoard3x3True() {
        board3x3.arr = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 0}};
        assertTrue(board3x3.isSolved());
    }

    @Test
    void isSolvedBoard4x4True() {
        board4x4.arr = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 0}};
        assertTrue(board4x4.isSolved());
    }

    @Test
    void isSolvedBoard3x3False() {
        board3x3.arr = new int[][]{{1, 2, 3},{4, 5, 6},{7, 0, 8}};
        assertFalse(board3x3.isSolved());
    }

    @Test
    void isSolvedBoard4x4False() {
        board4x4.arr = new int[][]{{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 0, 15}};
        assertFalse(board4x4.isSolved());
    }
}
