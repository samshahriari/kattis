import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        scan.close();
        String[] problems = line.split(";");
        int probNumb = 0;
        for (String string : problems) {
            if (string.contains("-")) {
                String[] numbers = string.split("-");
                probNumb+= Integer.parseInt(numbers[1]) - Integer.parseInt(numbers[0]) +1;
            } else probNumb++;

        }
        System.out.println(probNumb);
    }
}