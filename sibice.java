import java.util.Scanner;

public class sibice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int l = scan.nextInt();
        int b = scan.nextInt();
        double max = Math.sqrt((l*l+b*b));
        for (int i = 0; i < cases; i++) {
            System.out.println(scan.nextInt()>max? "NE": "DA");
        }
    }
}