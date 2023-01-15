package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1197 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int test = in.nextInt(), x, y, bingo =0;
        char x1, y1;
        for (int q = 0; q < test; q++) {
            String position = in.next();

            x1 = position.charAt(0);
            y1 = position.charAt(1);

            x = (int) x1 - 96;
            y = (int) y1 - 48;

            for (int i = -2; i <= 2; i++) {
                for (int j = -2; j<= 2; j++) {
                    if (j!= i) {
                        if (x -i >0 && y - j >0 && x -i <9 && y - j < 9) {
                            if (i*i+j *j == 5) {
                                bingo++;
                            }
                        }
                    }
                }
            }
            out.println(bingo);
            bingo = 0;
        }
        out.flush();
    }
}