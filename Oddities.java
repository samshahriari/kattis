import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i =0 ; i<a; i++) {
            int b= scan.nextInt();
            if (b%2 == 0) System.out.println(b + " is even");
            else System.out.println(b + " is odd");
        }
    }
}