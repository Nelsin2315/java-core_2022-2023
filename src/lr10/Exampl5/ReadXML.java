package lr10.Exampl5;

import org.w3c.dom.Document;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXML {
    public static void raead () {
        try {
            File inputFile = new File("src/lr10/Exampl5/example.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document car = docBuilder.parse(inputFile);
            car.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + car.getDocumentElement().getNodeName());
            NodeList nodeList = car.getElementsByTagName("avto");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Название марки автомобиля: "
                            + element.getElementsByTagName("Stamp").item(0)
                            .getTextContent());
                    System.out.println("Название модели автомобиля: "
                            + element.getElementsByTagName("Model").item(0)
                            .getTextContent());
                    System.out.println("Год производства: "
                            + element.getElementsByTagName("Year").item(0)
                            .getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
