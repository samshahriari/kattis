import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class pickupsticks {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int sticks = io.getInt();
        int cases = io.getInt();
        HashMap<Integer, Integer> numOnTop = new HashMap<>();
        for (int i = 1; i <= sticks; i++) {
            numOnTop.put(i, 0);
        }
        HashMap<Integer, ArrayList<Integer>> isOnTop = new HashMap<>();
        for (int i = 0; i < cases; i++) {
            int top = io.getInt();
            int bottom = io.getInt();
            numOnTop.put(bottom, numOnTop.getOrDefault(bottom, 0) + 1); // vi lägger till klossen på
            ArrayList<Integer> bots = isOnTop.getOrDefault(top, new ArrayList<>());
            bots.add(bottom);
            isOnTop.put(top, bots);
            // System.out.println(top + "has " + isOnTop.get(top).size() + " under");
        }
        // todo någon form av loop
        int prevSticksLeft = Integer.MAX_VALUE;
        Queue<Integer> q = new LinkedList<>();
        while (prevSticksLeft > 0 && (prevSticksLeft - sticks > 0) && sticks > 0) {
            prevSticksLeft = sticks;
            Iterator<Map.Entry<Integer, Integer>> iter = numOnTop.entrySet().iterator();
            while (iter.hasNext()) {
                // System.out.println(e.getKey() + ":" + e.getValue());
                Map.Entry<Integer, Integer> e = iter.next();
                if (e.getValue() == 0) {
                    sticks--;
                    // System.err.println(e.getKey());
                    q.add(e.getKey());
                    if (isOnTop.containsKey(e.getKey())) {
                        for (int b : isOnTop.get(e.getKey())) {
                            // System.err.println("decrement " + b);
                            numOnTop.put(b, numOnTop.get(b) - 1);
                        }
                    }
                    iter.remove();
                }
            }
            // System.err.println("varv");
        }
        if (sticks != 0)
            io.println("IMPOSSIBLE");

        else
            for (Integer integer : q) {
                io.println(integer);
            }

        io.close();
    }
}