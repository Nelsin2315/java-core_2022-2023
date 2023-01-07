package lr8.Example1.Example6;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in=null;
        Writer out=null;
        try {
            in = new FileReader("E:\\MyFile1.txt");
            out= new FileWriter("E:\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        }
    }
}
