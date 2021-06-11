public class sorttwonumbers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        int a = io.getInt();
        int b = io.getInt();
        io.print(a<b ? a + " " +b : b + " " + a);
        io.close();
    }
}
