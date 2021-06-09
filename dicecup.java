import java.util.Scanner;

public class  dicecup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diceOne = scan.nextInt();
        int diceTwo = scan.nextInt();
        scan.close();
        int  minDice = Math.min(diceOne, diceTwo);
        int  maxDice = Math.max(diceOne, diceTwo);
        int minDiceCopy = minDice;
        for (int i = 0; i <= maxDice - minDice; i++) {
            System.out.println(++minDiceCopy);
        }

    }
}