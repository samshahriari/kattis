import java.util.Scanner;

public class heartrate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int b = scan.nextInt();
            float p = scan.nextFloat();
            System.out.println(((60*(b-1))/p) + " " + ((60*b)/p) + " " + ((60*(b+1))/p));
        }
    }
}