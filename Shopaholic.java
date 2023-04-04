import java.util.Arrays;
import java.util.Scanner;

public class Shopaholic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] l = new int[cases];
        for (int i = 0; i < cases; i++) {
            l[i] = scan.nextInt();
        }
        Arrays.sort(l);
        int sum = 0;
        for (int i = l.length -3; i >= 0; i-=3) {
            sum+= l[i];
        }
        System.out.println(sum);
    }
}