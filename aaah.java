import java.util.Scanner;

public class  aaah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int one = scan.next().length();
        int two = scan.next().length();
        System.out.println( one>= two ? "go" : "no" );
    }
}