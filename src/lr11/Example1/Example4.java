package lr11.Example1;

public class Example4 {

    public static void main(String[] args) {
        System.out.println(facr (5));
    }

    public static int facr (int n) {
        int result;
        if (n==1) return 1;
        else {
            result = facr(n-1)*n;
            return result;
        }
    }
}
