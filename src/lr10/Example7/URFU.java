package lr10.Example7;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class URFU {
    public static void main(String[] args) {
        String url = "http://fat.urfu.ru/index.html";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links)
            {
                System.out.println(link.attr("abs:href"));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
