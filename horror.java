import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class horror {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);

        int N = io.getInt();
        int H = io.getInt();
        int L = io.getInt();

        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for (int i = 0; i < H; i++) {
            int horrorMovie = io.getInt();
            HashSet<Integer> from = graph.getOrDefault(horrorMovie, new HashSet<>());
            from.add(N);
            graph.put(horrorMovie, from);
            HashSet<Integer> to = graph.getOrDefault(N, new HashSet<>());
            to.add(horrorMovie);
            graph.put(N, to);
        }

        for (int i = 0; i < L; i++) {
            int from = io.getInt();
            int to = io.getInt();
            HashSet<Integer> fromBridges = graph.getOrDefault(from, new HashSet<>());
            fromBridges.add(to);
            graph.put(from, fromBridges);
            HashSet<Integer> toBridges = graph.getOrDefault(to, new HashSet<>());
            toBridges.add(from);
            graph.put(to, toBridges);
        }

        int[] dist = new int[N + 1];
        ArrayList<Integer> q = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            dist[i] = Integer.MAX_VALUE;
            q.add(i);
        }
        dist[N] = 0;

        while (!q.isEmpty()) {
            int u = q.get(0);
            for (int i : q) {
                u = dist[i] < dist[u] ? i : u;
            }
            q.remove(Integer.valueOf(u));
            if (!graph.containsKey(u))
                continue;
            for (int neighbor : graph.get(u)) {
                if (q.contains(neighbor)) {
                    int alt = dist[u] + 1;
                    if (alt < dist[neighbor])
                        dist[neighbor] = alt;
                }
            }
        }

        // https://stackoverflow.com/questions/22911722/how-to-find-array-index-of-largest-value
        int maxAt = 0;
        for (int i = 0; i < dist.length; i++) {
            maxAt = dist[i] > dist[maxAt] ? i : maxAt;
        }

        io.println(maxAt);
        // io.println(dist[maxAt]);
        io.close();
    }

}