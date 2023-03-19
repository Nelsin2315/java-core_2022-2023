package lr10.Example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HTML_ITLEARN {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select ("a[href]");
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
