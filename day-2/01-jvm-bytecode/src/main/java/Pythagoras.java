public class Pythagoras {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = calc(a, b);
        System.out.println(c);
    }

    static int calc(int a, int b) {
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}