import java.util.Scanner;

public class classfieldtrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();

        int f = 0;
        int s = 0;
        while (f < first.length() && s < second.length()) {
            if (first.charAt(f) < second.charAt(s)) {
                System.out.print(first.charAt(f));
                f++;
            } else {
                System.out.print(second.charAt(s));
                s++;
            }
        }
        System.out.print(first.substring(f));
        System.out.print(second.substring(s));
    }
}