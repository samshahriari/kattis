import java.util.Scanner;

public class filip {
    public static int reverse(int n) {
        int reverse = 0;
        int last = n % 10;
        n-=last;
        reverse += last*100;
        last = n % 100;
        n-=last;
        reverse += last;
        reverse += n/100;
        return reverse;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(Math.max(reverse(scan.nextInt()),reverse(scan.nextInt())));
        scan.close();

    }
}