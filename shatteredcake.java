
public class shatteredcake {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int w = io.getInt();
        int a = 0;
        int cases = io.getInt();
        for (int i = 0; i < cases; i++) {
            a+= io.getInt()*io.getInt();
        }
        int l = a/w;
        System.out.println(l);
    }
}