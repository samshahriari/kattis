import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class cudoviste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        ArrayList<String> city = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            city.add(scan.next());
        }
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (!(city.get(i).charAt(j) == '#' ||
                        city.get(i + 1).charAt(j) == '#' ||
                        city.get(i).charAt(j + 1) == '#' ||
                        city.get(i + 1).charAt(j + 1) == '#')) {
                    int count = 0;
                    if (city.get(i).charAt(j) == 'X')
                        count++;
                    if (city.get(i).charAt(j + 1) == 'X')
                        count++;
                    if (city.get(i + 1).charAt(j) == 'X')
                        count++;
                    if (city.get(i + 1).charAt(j + 1) == 'X')
                        count++;
                    counts.put(count, counts.getOrDefault(count, 0) + 1);
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(counts.getOrDefault(i, 0));

        }
    }
}