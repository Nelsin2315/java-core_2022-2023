package lr8.Example2;

import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        PrintWriter bw = null;
        Scanner in = new Scanner(System.in);

        try {
            File f1 = new File("E:\\MyFile1.txt");
            f1.createNewFile();
            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();

            bw = new PrintWriter(f1.getAbsolutePath(),"cp1251");

            String str;
            for (int i = 0; i < 2; i++) {
                System.out.println("Введите текст: ");
                str = in.nextLine();
                bw.println(str);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Введите double число (через ,): ");
                double db = in.nextDouble();
                bw.println(db);
            }
            bw.flush();
            bw.close();

            br = new BufferedReader(new InputStreamReader(new FileInputStream(f1.getAbsolutePath()), "cp1251"));
            bw = new PrintWriter(f2.getAbsolutePath(), "cp1251");

            for(int i = 1; i< 3; i++){
                str= br.readLine();
                if (i == 2) {
                    bw.println(str);
                }
            }
            double db;
            for(int i = 0; i< 5; i++){
                db = Double.parseDouble(br.readLine());
                if (db > 0) bw.println(db);
            }

        }catch(IOException e){
            System.out.println("Ошибка: " + e);
        } finally{
            br.close();
            bw.flush();
            bw.close();
        }
    }
}