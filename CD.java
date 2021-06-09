import java.util.HashSet;
import java.util.Scanner;

public class CD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long M = scan.nextLong();
        HashSet<Long> katalog = new HashSet<>();
        while (scan.hasNext()){
            long a = scan.nextLong();
            if(a == 0) if (scan.nextInt()==0) break;
            katalog.add(a);
        }
        System.out.println(M+N-katalog.size());
        while (scan.hasNext()) scan.next();
    }
}