import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class guessthedatastructure {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNextInt()) {
                Queue<Integer> q = new LinkedList<>();
                LinkedList<Integer> s = new LinkedList<>();
                PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
                boolean canBeQ = true;
                boolean canBeS = true;
                boolean canBePq = true;
                boolean impossible = false;
                int size = 0;

                int cases = scan.nextInt();
                for (int i = 0; i < cases; i++) {

                    if (impossible) {
                        scan.nextLine();
                    } else if (scan.nextInt() == 1) {
                        int numb = scan.nextInt();
                        q.add(numb);
                        s.push(numb);
                        pq.add(numb);
                        size++;
                    } else {
                        if (size < 1) {
                            impossible = true;
                        }
                        int expected = scan.nextInt();
                        if (!impossible) {
                            if (expected != q.poll())
                                canBeQ = false;
                            if (expected != s.pop())
                                canBeS = false;
                            if (expected != pq.poll())
                                canBePq = false;
                            size--;
                        }
                    }
                }
                if (impossible || (!canBePq && !canBeQ && !canBeS))
                    System.out.println("impossible");
                else if (canBePq && !canBeQ && !canBeS)
                    System.out.println("priority queue");
                else if (!canBePq && canBeQ && !canBeS)
                    System.out.println("queue");
                else if (!canBePq && !canBeQ && canBeS)
                    System.out.println("stack");
                else
                    System.out.println("not sure");

            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}