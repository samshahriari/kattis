public class triarea {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out); 
        int a = io.getInt();
        int b = io.getInt();
        double area = a*b/2.0;
        io.println(area);
        io.close();
    }
}