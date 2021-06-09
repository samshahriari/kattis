import java.util.Scanner;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int outlets = scan.nextInt();
            int sum = 1-outlets;
            for (int j = 0; j < outlets; j++) {
                sum+=scan.nextInt();
            }
            System.out.println(sum);
        }
    }
}