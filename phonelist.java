import java.util.Arrays;
import java.util.Scanner;

public class phonelist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            String[] l = new String[scan.nextInt()];
            for (int j = 0; j < l.length; j++) {
                l[j] = scan.next();
            }
            Arrays.sort(l);
            boolean consistent = true;
            for (int j = 0; j < l.length-1; j++) {
                if (!consistent) break;
                if (l[j+1].startsWith(l[j])) {
                    consistent = false;
                    break;
                }
            }
            System.out.println(consistent?"YES":"NO");
        }
    }
}