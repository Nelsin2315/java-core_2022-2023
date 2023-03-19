package lr10.Exampl5;
import java.io.File;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void searchcar () {
        try {
            File inputFile = new File("src/lr10/Exampl5/example.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document car = docBuilder.parse(inputFile);

            XPathFactory xpathFactory = XPathFactory.newInstance();
            XPath xpath = xpathFactory.newXPath();
            car.getDocumentElement().normalize();
            NodeList nodeList = car.getElementsByTagName("avto");
            List<String> search = getMarka(car, xpath);
            System.out.println("Модель автомобиля автмообиля: " + search.toString());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    private static List<String> getMarka(Document doc, XPath xpath)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String marka = in.nextLine();

        List<String> list = new ArrayList<>();
        try {
            XPathExpression xPathExpression = xpath.compile("/cars/avto[Stamp='"+marka+"']/Model/text()");
            NodeList nodes = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < nodes.getLength(); i++)
                list.add(nodes.item(i).getNodeValue());
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return list;
    }
}
