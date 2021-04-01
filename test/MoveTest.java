import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveTest {

    Board3x3 board;
    Move move;
    
    @BeforeEach
    void setup(){
        board = new Board3x3();
        board.arr = new int[][]{{1, 2, 3},{4, 7, 5},{6, 8, 0}};
        move = new Move(board);
    }

    @Test
    void up(){
        move.up();
        assertEquals(5, board.arr[2][2]);
    }

    @Test
    void down(){
        move.up();
        move.down();
        assertEquals(0, board.arr[2][2]);
    }

    @Test
    void left(){
        move.left();
        assertEquals(8, board.arr[2][2]);
    }

    @Test
    void right(){
        move.left();
        move.right();
        assertEquals(0, board.arr[2][2]);
    }
}
