import java.util.Scanner;

public class  tarifa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grans = scan.nextInt();
        int manader = scan.nextInt();
        int surf= grans*manader;
        for (int i = 0; i<manader;i++) {
            surf-=scan.nextInt();
        }
        System.out.println(surf+grans);
    }
}