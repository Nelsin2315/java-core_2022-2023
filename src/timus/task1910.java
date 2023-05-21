package timus;

import java.io.*;
import java.util.Locale;


public class task1910 {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    private static double nextNum() throws IOException {
        input.nextToken();
        return input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        int n = (int) nextNum();

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) nextNum();
        }

        int summa = 0;
        int number = 0;
        for (int i = 0; i < n - 2; i++) {
            int sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > sum) {
                summa = sum;
                number = i + 2;
            }
        }

        out.print(summa + " " + number);

        out.flush();
    }
}
