public class ofugsnuid {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int cases = io.getInt();
        int[] list = new int[cases];
        for (int i = 0; i < cases; i++) {
            list[i] = io.getInt();
        }
        for (int j = list.length-1; j >=0; j--) {
            io.println(list[j]);
        }
        io.close();
    }
}