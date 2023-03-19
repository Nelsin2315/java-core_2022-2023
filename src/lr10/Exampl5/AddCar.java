package lr10.Exampl5;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AddCar {
    public static void add () {
        try{
            Scanner in = new Scanner(System.in);
            File inputFile = new File("src/lr10/Exampl5/example.xml");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document car = docBuilder.parse(inputFile);

            System.out.print("Введите марку автомобиля: ");
            String stamp = in.nextLine();

            System.out.print("Введите модель автомобиля: ");
            String model = in.nextLine();

            System.out.print("Введите год производства автомобиля: ");
            String year = in.nextLine();

            Element avto1 = car.createElement("avto");
            car.getDocumentElement().appendChild(avto1);

            Element stamp1 = car.createElement("Stamp");
            stamp1.appendChild((car.createTextNode(stamp)));
            avto1.appendChild(stamp1);

            Element model1 = car.createElement("Model");
            model1.appendChild(car.createTextNode(model));
            avto1.appendChild(model1);

            Element year1 = car.createElement("Year");
            year1.appendChild(car.createTextNode(year));
            avto1.appendChild(year1);

            car.setXmlStandalone(true);
            car.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","2");
            DOMSource source = new DOMSource(car);
            StreamResult result = new StreamResult(new FileOutputStream("src/lr10/Exampl5/example.xml"));
            transformer.transform(source, result);

            System.out.println("Марка машины добавлена.");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
