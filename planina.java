import java.util.Scanner;

public class  planina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int tal = 2;
        for (int i = 0; i < number; i++) {
            tal = 2*tal-1;
        }
        System.out.println(tal*tal);

    }
}