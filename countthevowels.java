import java.util.HashSet;
import java.util.Scanner;

public class countthevowels {
    public static void main(String[] args) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().toUpperCase();
        for (Character character : s.toCharArray()) {
            if (vowels.contains(character))
                count++;
        }
        System.out.println(count);
    }
}