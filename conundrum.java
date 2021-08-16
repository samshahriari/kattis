import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        conundrum c = new conundrum();
        System.out.println(c.replacements(word));
        
    }
    private int replacements(String subString) {
        if (subString.length() == 3) {
            subString = subString.toLowerCase();
            int corrext = 3;
            if (subString.charAt(0) == 'p' ) corrext--;
            if (subString.charAt(1) == 'e' ) corrext--;
            if (subString.charAt(2) == 'r' ) corrext--;
            return corrext;
        }
        else {
            int corrext = 0;
            corrext += replacements(subString.substring(0, 3));
            corrext += replacements(subString.substring(3));
            return corrext;
        }

    }
}
