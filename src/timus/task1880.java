package timus;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class task1880 {
    static Scanner input = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String str[]) {
        Locale.setDefault(Locale.US);

        final int n1 = input.nextInt();
        int Array1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            Array1[i] = input.nextInt();
        }

        final int n2 = input.nextInt();
        int Array2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            Array2[i] = input.nextInt();
        }

        final int n3 = input.nextInt();
        int Array3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            Array3[i] = input.nextInt();
        }

        LinkedList<Integer> match = new LinkedList<Integer>();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (Array1[i] < Array2[j]) {
                    break;
                }
                if (Array1[i] == Array2[j]) {
                    match.addLast(Array1[i]);
                    break;
                }
            }
        }

        int res = 0;
        for (Integer next : match) {

            for (int j = 0; j < n3; j++) {
                if (next < Array3[j]) {
                    break;
                }
                if (next == Array3[j]) {
                    res++;
                }
            }
        }

        out.println(res);
        out.flush();
    }
}
