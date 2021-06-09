import java.util.Scanner;

public class sodaslurper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int current = scan.nextInt() + scan.nextInt();
        int cost = scan.nextInt();
        scan.close();
        int drank = 0;
        while (current>= cost) {
            int bought = current/cost;
            drank+=bought;
            current -= bought*cost;
            current += bought;
        }
        System.out.println(drank);
    }
}