import java.util.Scanner;

public class autori {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split("-");
        scan.close();
        for (String s: arr) {
            System.out.print(s.charAt(0));
        }
    }
}