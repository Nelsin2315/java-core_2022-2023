package timus;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class task1881 {
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int h = input.nextInt();
        final int w = input.nextInt();
        final int n = input.nextInt();

        int word[] = new int[n];
        for (int i = 0; i < n; i++) {
            word[i] = input.next().length();
        }

        int cont = 1;
        int all = -1;
        for (int i = 0; i < n; i++) {
            all = all + word[i] + 1;
            if (all > w) {
                cont++;
                all = word[i];
            }
        }

        int result = cont / h;
        if ((cont % h) > 0) {
            result++;
        }

        out.println(result);
        out.flush();
    }
}
