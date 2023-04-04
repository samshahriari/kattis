import java.util.ArrayList;
import java.util.Scanner;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= cases; i++) {
            for (int j = 1; j <= cases; j++) {
                int cost = scan.nextInt();
                if (cost != -1)
                    ans.add(i + " " + j + " " + cost);
            }

        }
        System.out.println(ans.size());
        for (String string : ans) {
            System.out.println(string);
        }
    }
}