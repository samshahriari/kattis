import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            switch (scan.nextInt()) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(6);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                default:
                    System.out.println(0);
                    break;
            }
        }
    }
}