import java.util.Scanner;

public class laptopsticker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wc = sc.nextInt();
        int dc = sc.nextInt();
        int ws = sc.nextInt();
        int ds = sc.nextInt();
        System.out.println(wc-2 >= ws && dc-2 >= ds? 1 : 0);
    }
}
