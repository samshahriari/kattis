import java.util.Scanner;

public class weightofwords {
    public static void main(String[] args) {
        System.out.println(4 + 4 * 4);
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int weight = scan.nextInt();
        scan.close();
        if (!solutionExists(length, weight)) {
            System.out.println("impossible");
            return;
        }
        int currentWeight = 0;
        char currentLetter = 'z';
        StringBuilder sb = new StringBuilder(length);
        // den går att lägga till
        while (sb.length() < length) {
            // maxvikt som kommer finnas kvar
            if (solutionExists(length - sb.length() - 1, weight - currentWeight - weightOfLetter(currentLetter))) {
                sb.append(currentLetter);
                currentWeight += weightOfLetter(currentLetter);
            } else {
                currentLetter--;
            }
        }
        System.out.println(sb.toString());
    }

    static boolean solutionExists(int length, int weight) {
        if (weight < length || weight > length * 26) {
            return false;
        }
        return true;
    }

    static int weightOfLetter(char c) {
        return c - 96;
    }
}