import java.util.HashSet;
import java.util.Scanner;

public class icpcawards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        HashSet<String> universities = new HashSet<>();
        while(universities.size()<12) {
            String uni = scan.next();
            String name = scan.next();
            if(!universities.contains(uni)) {
                universities.add(uni);
                System.out.println(uni + " " + name);
            }
        }
        scan.close();
    }
}