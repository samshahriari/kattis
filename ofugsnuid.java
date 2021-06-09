import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] list = new int[cases];
        for (int i = 0; i < cases; i++) {
            list[i] = scan.nextInt();
        }
        scan.close();
        for (int j = list.length-1; j >=0; j--) {
            System.out.println(list[j]);
        }
    }
}