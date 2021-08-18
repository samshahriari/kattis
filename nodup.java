import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class nodup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sent = scan.nextLine();
        scan.close();
        String[] numspaces = sent.split(" ");
        HashSet<String> unika = new HashSet<>(Arrays.asList(numspaces));
        System.out.println(unika.size() == numspaces.length ? "yes" : "no" );
    }
}