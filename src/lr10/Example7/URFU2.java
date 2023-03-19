package lr10.Example7;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.commons.io.output.TeeOutputStream;

public class URFU2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            try {
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                OutputStream teeStream = new TeeOutputStream(System.out, buffer);
                System.setOut(new PrintStream(teeStream));
                Elements newsParent = doc
                        .select("body > table > tbody > tr > td > div > table > " +
                                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                                "tr > td:nth-child(1)");

                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        System.out.println("Тема: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blocktitle")
                                        .get(0).childNodes().get(0));

                        System.out.println("Дата: " +
                                ((Element) nodes.get(i))
                                        .getElementsByClass("blockdate")
                                        .get(0).childNodes().get(0) + "\n");
                    }
                }
                try(OutputStream fileStream = new FileOutputStream("src/lr10/Example7/URFU.txt")) {
                    buffer.writeTo(fileStream);
                }
            } catch (IOException e) {
                throw new UnknownHostException("Error connect");
            }
        }
        catch (UnknownHostException exception)
        {
            System.out.println(exception);
            System.out.println("Переподключиться?? (1 - да или 0 - нет)");
            int reconnect = in.nextInt();
            if (reconnect == 1)
            {
                URFU2.main(args);
            }
        }
    }
}
