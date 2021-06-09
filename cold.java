import java.util.Scanner;

public class cold {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int days = 0;
        for (int i = 0; i < max; i++) if (scan.nextInt() < 0) days++;
        scan.close();
        System.out.println(days);
    }
}
