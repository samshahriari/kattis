public class echoechoecho {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        String in = io.getWord();
        io.print(in+ " ");
        io.print(in+ " ");
        io.print(in);
        io.close();
    }
}
