import java.util.Scanner;

public class numberfun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = scan.nextInt();
            if (a+b == result || a-b == result || b-a == result||a*b== result||(float)a/b==result||(float)b/a==result ) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}