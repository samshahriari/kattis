import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        if (cases %2 == 1) {
            System.out.println("still running");
            return;
        }
        int tot = 0;
        for (int i = 0; i < cases/2; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            tot += b-a;
        }
        System.out.println(tot);
    }
}