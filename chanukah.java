import java.util.Scanner;

public class chanukah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            scan.nextInt();
            int a = scan.nextInt();
            System.out.println(i +1+" " + (a+3)*(a)/2);
        }
    }
}