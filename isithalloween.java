import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        int date = scan.nextInt();
        if ((month.equals("DEC") && date ==25) ||(month.equals("OCT") && date ==31)) System.out.println("yup");
        else System.out.println("nope");
    }
}