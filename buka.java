import java.util.Scanner;

public class buka {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.next().length();
        char b = scan.next().charAt(0);
        int c = scan.next().length();
        scan.close();
        switch (b) {
            case '+':
                if (a==c) {
                    System.out.print('2');
                    for (int i = 0; i < a - 1; i++) {
                        System.out.print('0');
                    }
                } else {
                    System.out.print(1);
                    int max = Math.max(a, c);
                    int min = Math.min(a, c);
                    for (int i = 0; i < max - min - 1; i++) {
                        System.out.print('0');
                    }
                    System.out.print(1);
                    for (int i = 0; i < min - 1; i++) {
                        System.out.print('0');
                    }
                }
                break;
        
            case '*':
                System.out.print('1');
                for (int i = 0; i < a + c - 2; i++) {
                    System.out.print('0');
                }
                break;
        }

    }
}