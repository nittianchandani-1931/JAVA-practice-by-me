
public class Inheritence {
    public static void main(String[] args) {
        VeryAdvCalci obj = new VeryAdvCalci();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(23, 6);
        int r3 = obj.multi(5, 6);
        int r4 = obj.div(7, 9);
        double r5 = obj.power(2, 4);
        System.out.println(r1 + " " + r2 + " " +r3 + " " + r4 + "  " + r5);
    }
}
