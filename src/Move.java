public class Move {

    Board3x3 board3x3;
    int i = 2;
    int j = 2;
    int[][] underscore;

    public moveUp() {
        int[][] array = board3x3.getArr();
        underscore[i][j] = array[2][2];
        //totally untested, hopefully it works (damn you vlad for using java 12 or higher)
        if(underscore[i][j] <= array[2][2] && underscore[i][j] >= array[1][0]) {
            underscore[i][j] = underscore[i-1][j];
        }
    }
}
