import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        int length = input.length();

        int blank = 0, upper = 0, lower = 0, rest = length;
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch == '_') {
                blank++;
                rest--;
            }
            else if (ch >= 'A' && ch <= 'Z'){
                upper++;
                rest--;    
            }
            else if (ch >= 'a' && ch <= 'z') {
                rest--;
                lower++;
            }
        }
        System.out.println((double) blank/length);
        System.out.println((double) lower/length);
        System.out.println((double) upper/length);
        System.out.println((double) rest/length);
    }
}