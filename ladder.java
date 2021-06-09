import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int v = scan.nextInt();
scan.close();
       int x=(int) Math.ceil(h / Math.sin(Math.toRadians(v)));
       System.out.println(x);
    }
}