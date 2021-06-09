import java.util.ArrayList;
import java.util.Scanner;

public class cetvrta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> xL = new ArrayList<>();
        ArrayList<Integer> yL = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int x = scan.nextInt();
            if (xL.contains(x)) xL.remove(xL.indexOf(x));
            else xL.add(x);

            int y = scan.nextInt();
            if (yL.contains(y)) yL.remove(yL.indexOf(y));
            else yL.add(y);
        }
        System.out.println(xL.get(0) + " " + yL.get(0));
    }
}