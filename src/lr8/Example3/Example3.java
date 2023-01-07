package lr8.Example3;

import java.io.*;

public class Example3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;

        try {
            String symbol = "бБвВгГдДжЖзЗйЙкКлЛмМнНпПрРсСтТфФхХцЦчЧшШщЩ";
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("src/lr8/Example3/Stix.txt"), "UTF8"));

            File f1 = new File("src/lr8/Example3/Result.txt");
            f1.createNewFile();

            out = new PrintWriter("src/lr8/Example3/Result.txt","UTF8");

            int str = 0;
            int words = 0;
            String str1;

            while ((str1 = br.readLine()) != null) {
                words = 0;
                if (str1.length() != 0) {
                    out.print("Строка: " + str + " ");
                    for (String word : str1.split(" ")) {
                        if (symbol.contains(word.substring(0, 1))){
                            out.print(word + " ");
                            words++;
                        }
                    }
                } else out.print("Строка: " + str + " ");
                out.print(" Количество слов: " + words);
                str++;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!" + e);
        }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }
}