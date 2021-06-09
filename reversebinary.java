import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String binary = Integer.toBinaryString(scan.nextInt());
        scan.close();
        StringBuilder sb = new StringBuilder(binary);
        sb.reverse();
        System.out.println(Integer.parseInt(sb.toString(), 2));
    }
}