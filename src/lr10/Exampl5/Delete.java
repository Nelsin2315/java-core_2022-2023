package lr10.Exampl5;

import org.w3c.dom.Document;
import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Delete {
    public static void deletecar () {
        try {
            File inputFile = new File("src/lr10/Exampl5/example.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document car = docBuilder.parse(inputFile);
            car.getDocumentElement().normalize();
            NodeList List = car.getElementsByTagName("avto");

            Node av = List.item(0);
            Element avtoElement = (Element) av;
            avtoElement.getElementsByTagName("avto").item(0);

            Node av1 = avtoElement.getParentNode();
            av1.removeChild(avtoElement);

            car.setXmlStandalone(true);
            car.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(car);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("src/lr10/Exampl5/example.xml"));
            transformer.transform(source, result);

            System.out.println("Марка машины удалена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
