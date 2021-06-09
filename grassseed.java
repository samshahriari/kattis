import java.util.Scanner;

public class  grassseed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cost = scan.nextDouble();
        double totalCost = 0;
        int rows = scan.nextInt();
        for(int i = 0; i < rows; i++) {
            totalCost += scan.nextDouble() * scan.nextDouble() * cost;
        }
        scan.close();
        System.out.println(totalCost);

    }
}