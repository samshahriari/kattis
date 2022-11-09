public class zanzibar {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int cases = io.getInt();
        for (int i = 0; i < cases; i++) {
            int prev = io.getInt();
            int next;
            int tot = 0;
            while((next = io.getInt()) > 0) {
                if (next > 2*prev) tot+= next-2*prev;
                prev = next;
            }
            io.println(tot);
        }
        io.close();
    }
}