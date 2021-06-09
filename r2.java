import java.util.Scanner;

public class  r2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tal = scan.nextInt();
        int medel = scan.nextInt();
        scan.close();
        System.out.println(2*medel - tal);

    }
}