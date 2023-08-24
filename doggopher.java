
public class doggopher {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in, System.out);
        double slowX = io.getDouble();
        double slowY = io.getDouble();
        double fastX = io.getDouble();
        double fastY = io.getDouble();

        while (io.hasMoreTokens()) {
            double holeX = io.getDouble();
            double holeY = io.getDouble();
            double timeSlow = Math.sqrt(Math.pow(slowX - holeX, 2) + Math.pow(slowY - holeY, 2));
            double timeFast = (Math.sqrt(Math.pow(fastX - holeX, 2) + Math.pow(fastY - holeY, 2))) / 2;
            System.err.println(timeSlow);
            System.err.println(timeFast);
            if (timeSlow <= timeFast) {
                io.println("The gopher can escape through the hole at (" + holeX + "," + holeY + ").");
                io.close();
                return;
            }
        }
        io.println("The gopher cannot escape.");
        io.close();
    }
}