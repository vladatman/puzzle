public class MoveTest {
    @Test
    void up(){
        Board3x3 board1 = new Board3x3();
        Move move1 = new Move();
        assertEquals(move1.up(board1));
    }
    @Test
    void down(){
        Board3x3 board1 = new Board3x3();
        Move move1 = new Move();
        assertEquals(move1.down(board1));
    }
    @Test
    void left(){
        Board3x3 board1 = new Board3x3();
        Move move1 = new Move();
        assertEquals(move1.left(board1));
    }
    @Test
    void right(){
        Board3x3 board1 = new Board3x3();
        Move move1 = new Move();
        assertEquals(move1.right(board1));
    }
}
