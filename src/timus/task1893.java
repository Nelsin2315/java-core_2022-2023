package timus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;

public class task1893 {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    final static String WINDOW = "window";
    final static String AISLE = "aisle";
    final static String NEITHER = "neither";

    static final String checkFirst(String letter) {
        if (letter.equals("A") || letter.equals("D")) {
            return WINDOW;
        }
        return AISLE;
    }

    static final String checkSecond(String letter) {
        if (letter.equals("A") || letter.equals("F")) {
            return WINDOW;
        }
        return AISLE;
    }

    static final String checkThird(String letter) {
        if (letter.equals("A") || letter.equals("K")) {
            return WINDOW;
        }
        if (letter.equals("B") || letter.equals("E") ||
                letter.equals("F") || letter.equals("J")) {
            return NEITHER;
        } else {
            return AISLE;
        }
    }

    public static void main(String str[]) throws Exception {
        Locale.setDefault(Locale.US);

        String place = buffer.readLine();

        String letter = place.substring(place.length() - 1).toUpperCase();
        int number = Integer.parseInt(place.substring(0, place.length() - 1));

        String result = "";
        if (number > 0 && number < 3) result = checkFirst(letter);
        else if (number >= 3 && number < 21) result = checkSecond(letter);
        else if (number >= 21 && number < 66) result = checkThird(letter);

        out.println(result);
        out.flush();
    }
}
