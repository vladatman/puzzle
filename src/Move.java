public class Move {

    Board board;
    int underscore_i;
    int underscore_j;

    public Move(Board board) {
        this.board = board;
        this.underscore_i = board.arr.length - 1;
        this.underscore_j = board.arr.length - 1;
    }

    public void up(){
        if(this.underscore_i != 0){
            this.board.arr[this.underscore_i][this.underscore_j] = this.board.arr[this.underscore_i - 1][this.underscore_j];
            this.board.arr[this.underscore_i - 1][this.underscore_j] = 0;
            this.underscore_i--;
        }
    }

    public void down(){
        if(this.underscore_i != board.arr.length - 1){
            this.board.arr[this.underscore_i][this.underscore_j] = this.board.arr[this.underscore_i + 1][this.underscore_j];
            this.board.arr[this.underscore_i + 1][this.underscore_j] = 0;
            this.underscore_i++;
        }
    }

    public void left(){
        if(this.underscore_j != 0){
            this.board.arr[this.underscore_i][this.underscore_j] = this.board.arr[this.underscore_i][this.underscore_j - 1];
            this.board.arr[this.underscore_i][this.underscore_j - 1] = 0;
            this.underscore_j--;
        }
    }

    public void right(){
        if(this.underscore_j != board.arr.length - 1){
            this.board.arr[this.underscore_i][this.underscore_j] = this.board.arr[this.underscore_i][this.underscore_j + 1];
            this.board.arr[this.underscore_i][this.underscore_j + 1] = 0;
            this.underscore_j++;
        }
    }

    public Board getBoard() {
        return this.board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getUnderscore_i() {
        return this.underscore_i;
    }

    public void setUnderscore_i(int underscore_i) {
        this.underscore_i = underscore_i;
    }

    public int getUnderscore_j() {
        return this.underscore_j;
    }

    public void setUnderscore_j(int underscore_j) {
        this.underscore_j = underscore_j;
    }
}
