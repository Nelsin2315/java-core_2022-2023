package timus;

import java.io.*;
import java.util.Locale;

public class task1792 {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer input = new StreamTokenizer(buffer);
    static PrintWriter out = new PrintWriter(System.out);

    public static final int nextInt() throws IOException {
        input.nextToken();
        return (int) input.nval;
    }

    public static void main(String str[]) throws IOException {
        Locale.setDefault(Locale.US);

        final int n = 7;
        int ins[] = new int[n];
        for (int i = 0; i < n; i++) {
            ins[i] = nextInt();
        }

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if (!(((ins[1] + ins[2] + ins[3]) % 2) == ins[4])) {
            flag1 = true;
        }

        if (!(((ins[0] + ins[2] + ins[3]) % 2) == ins[5])) {
            flag2 = true;
        }

        if (!(((ins[0] + ins[1] + ins[3]) % 2) == ins[6])) {
            flag3 = true;
        }


        if (flag1 && flag2 && flag3) {
            ins[3] = (ins[3] + 1) % 2;
        } else if (flag1 && flag2) {
            ins[2] = (ins[2] + 1) % 2;
        } else if (flag2 && flag3) {
            ins[0] = (ins[0] + 1) % 2;
        } else if (flag1 && flag3) {
            ins[1] = (ins[1] + 1) % 2;
        } else if (flag1) {
            ins[4] = (ins[4] + 1) % 2;
        } else if (flag2) {
            ins[5] = (ins[5] + 1) % 2;
        } else if (flag3) {
            ins[6] = (ins[6] + 1) % 2;
        }

        for (int i = 0; i < n; i++) {
            out.print(ins[i]);
            out.print(" ");
        }
        out.flush();
    }
}
