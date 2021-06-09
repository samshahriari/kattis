import java.util.Scanner;

public class bela {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char dominant = scan.next().charAt(0);
        int total = 0;
        for (int i = 0; i < n*4; i++) {
            String input = scan.next();
            switch (input.charAt(0)) {
                case 'A':
                    total+=11;
                    break;
                case 'K':
                    total+=4;
                    break;
                case 'Q':
                    total+=3;
                    break;
                case 'T':
                    total+=10;
                    break;
                case '9':
                    if(input.charAt(1) == dominant){
                        total+=14;

                    }break;
                case 'J':
                    if(input.charAt(1) == dominant){
                        total+=20;
                    } else total+=2;
                    break;
            }
        }
        System.out.println(total);
    }
}