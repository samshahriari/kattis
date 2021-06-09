import java.util.Scanner;

public class batterup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int total =0;
        int numbs =0;
        for (int i = 0; i < cases; i++) {
            int next = scan.nextInt();
            if (next!=-1) {
                total += next;
                numbs++;
            }
        }
        System.out.println((double)total/numbs);
    }
}