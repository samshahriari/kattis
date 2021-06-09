import java.util.Scanner;

public class spavanac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        scan.close();
        if (M<45) {
            H--;
            H = (H+24)%24;
        }
        M = ((M-45+60)%60);
        System.out.println(H + " " + M); 
    }

}
