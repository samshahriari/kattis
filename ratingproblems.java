import java.util.Scanner;

public class ratingproblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += sc.nextInt();
        }
        float min = sum -((n-k)*3.0f);
        float max = sum + ((n-k)*3.0f);
        System.out.println(min/n);
        System.out.println(max/n);
    }
}
