package lr11.Example1;

public class Example5 {
    public static int fact (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2) + fact(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(6));

        System.out.println("____________________________________");

        int n = 6;
        System.out.println("Число Фибаначи " + n + " равно " + fact(n));
    }
}
