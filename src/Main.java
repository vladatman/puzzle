import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        boolean game = true;
        while(game){
            System.out.println("Select option");
            int input = Integer.parseInt(myObj.nextLine());
            // method
            switch (input) {
                case 0 -> System.out.println("Starting 3x3");
                case 1 -> game = false;
            }
        }
    }
}
