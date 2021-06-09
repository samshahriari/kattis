import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.next().contains("ss")) System.out.println("hiss");
        else System.out.println("no hiss");
    }
}