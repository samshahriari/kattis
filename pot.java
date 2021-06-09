import java.util.Scanner;
import java.lang.Math;

public class pot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            String wrong = scan.next();
                int exponent = Integer.parseInt(wrong.substring(wrong.length() - 1));
                int number = (Integer.parseInt(wrong) - exponent)/10;
                sum+= Math.pow(number, exponent);
        }
        scan.close();
        System.out.println(sum);
    }
}