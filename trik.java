import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        String[] instructions = input.split("");
        int current = 1;
        for (String ch : instructions) {
            if (ch.equals("A")) {
                if (current == 1) current =2;
                else if (current == 2) current =1;
            }else if (ch.equals("B")) {
                if (current == 2) current =3;
                else if (current == 3) current =2;
            }else {
                if (current == 1) current =3;
                else if (current == 3) current =1;
            }
        }
        System.out.println(current);
        
    }
}