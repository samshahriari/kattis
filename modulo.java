import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class  modulo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> distinkt = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            distinkt.add(scan.nextInt()%42);
        }
        System.out.println(distinkt.size());
    }
}