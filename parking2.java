import java.util.Arrays;
import java.util.Scanner;

public class parking2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            int shop = scan.nextInt();
            int[] shopAddres = new int[shop];
            for (int j = 0; j < shop; j++) {
                shopAddres[j] = scan.nextInt();
            }
            Arrays.sort(shopAddres);
            int steps = 0;
            for (int j = 0; j < shopAddres.length; j++) {
                steps += Math.abs(shopAddres[j] - shopAddres[(j+1)%shop]);
            }
            System.out.println(steps);
        }
    }
}