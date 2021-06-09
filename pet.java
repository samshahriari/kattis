import java.util.Scanner;

public class pet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int top =0;
        int winner = 0;
        for (int i =0; i < 5; i++) {
            int total =0;
            total+= scan.nextInt();
            total+= scan.nextInt();
            total+= scan.nextInt();
            total+= scan.nextInt();
            if (total > top) {
                winner = i+1;
                top = total;
            }
        }
        System.out.println(winner + " " + top);
    }
}