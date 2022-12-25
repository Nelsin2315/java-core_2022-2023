package lr6.Example4;

public class Task4 {
    public static int getFactorialRec(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return getFactorialRec(n - 2) * n;
    }

    public static int getFactorialFor(int n) {
        int res = n;
        int j = n;
        for (int i=n; i>2;i=i-2) {
            j=j-2;
            res*= j;
        }
        return res;
    }
}
