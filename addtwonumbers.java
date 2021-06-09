import java.util.Scanner;
public class addtwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        sum += sc.nextInt();
        System.out.println(sum);
        sc.close();
    }
}
