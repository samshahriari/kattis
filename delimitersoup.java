import java.util.Scanner;
import java.util.Stack;

public class delimitersoup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        Stack<Character> q = new Stack<Character>();
        scan.nextLine();
        String word = scan.nextLine();
        for (int i = 0; i < length; i++) {
            switch (word.charAt(i)) {
                case '{':
                case '(':
                case '[':
                    q.add(word.charAt(i));
                    break;
                case '}':
                    if (q.isEmpty() || q.pop() != '{') {
                        System.out.println(word.charAt(i) + " " + i);
                        return;
                    }
                    break;
                case ')':
                    if (q.isEmpty() || q.pop() != '(') {
                        System.out.println(word.charAt(i) + " " + i);
                        return;
                    }
                    break;
                case ']':
                    if (q.isEmpty() || q.pop() != '[') {
                        System.out.println(word.charAt(i) + " " + i);
                        return;
                    }
                    break;

                default:
                    break;
            }
        }
        System.out.println("ok so far");
    }
}