import java.util.Scanner;
import java.math.*;

public class quickestimate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();
        for (int i = 0; i < nums; i++) {
            String in = scan.next();
            System.out.println(in.length());
        }
    }
}