import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;

public class everywhere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int persons = scan.nextInt();
        for (int i = 0; i < persons; i++) {
            HashSet<String> set = new HashSet<>();
            int citys = scan.nextInt();
            for (int j = 0; j < citys; j++) {
                set.add(scan.next());
            }
            System.out.println(set.size());
        }
        scan.close();
    }
}
