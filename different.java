import java.util.Scanner;

public class  different {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            System.out.println(Math.abs(scan.nextLong()-scan.nextLong()));
        }
    }
}