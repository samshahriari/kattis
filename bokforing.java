import java.util.HashMap;

public class bokforing {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int people = io.getInt();
        int cases = io.getInt();
        int start = 0;
        HashMap<Integer, Integer> kapital = new HashMap<>();
        for (int i = 0; i < cases; i++) {
            String instuction = io.getWord();
            if (instuction.charAt(0) == 'S') {

                kapital.put(io.getInt(), io.getInt());
                // kapital[n] = io.getInt();
            } else if (instuction.charAt(0) == 'P') {
                int n = io.getInt();

                io.println(kapital.getOrDefault(n, start));

            } else {
                kapital.clear();
                start = io.getInt();

            }
        }
        io.close();
    }
}