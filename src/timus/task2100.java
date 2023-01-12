package timus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2100 {
    public static void main(String[] args) {

        String inputFileName = "src/timus/task_2100/in.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        int marandlil = 2;

        try {

            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName)) ;

            String readLine;

            int numFr = 0;
            int numPar = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if (numFr == 0) {
                    numFr = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numPar++;
                }
            }

            int result;

            int gosti = (marandlil + numFr + numPar);

            if (gosti == 13) {
                result = (gosti * 100) + 100;
            } else {
                result = gosti * 100;
            }

            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
