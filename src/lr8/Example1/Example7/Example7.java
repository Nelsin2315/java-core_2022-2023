package lr8.Example1.Example7;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try {
            br = new BufferedReader(new FileReader("E:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            while ((s=br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!!"+e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }

}
