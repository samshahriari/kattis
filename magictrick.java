import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class magictrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] order = sc.next().toCharArray();
        sc.close();
        Set<Character> set = new HashSet<>();
        for(Character c : order) set.add(c);
        System.out.println(set.size() == order.length ? 1 : 0);
    }
}
