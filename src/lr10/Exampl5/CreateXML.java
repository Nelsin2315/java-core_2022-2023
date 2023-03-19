package lr10.Exampl5;

import org.apache.logging.log4j.core.appender.ScriptAppenderSelector;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document car = docBuilder.newDocument();
            Element rootElement = car.createElement("cars");
            car.appendChild(rootElement);

            Element avto1 = car.createElement("avto");
            rootElement.appendChild(avto1);

            Element stamp1 = car.createElement("Stamp");
            stamp1.appendChild(car.createTextNode("Toyota"));
            avto1.appendChild(stamp1);

            Element model1 = car.createElement("Model");
            model1.appendChild(car.createTextNode("Camri 70"));
            avto1.appendChild(model1);

            Element year1 = car.createElement("Year");
            year1.appendChild(car.createTextNode("2018"));
            avto1.appendChild(year1);

            Element avto2 = car.createElement("avto");
            rootElement.appendChild(avto2);

            Element stamp2 = car.createElement("Stamp");
            stamp2.appendChild(car.createTextNode("Opel"));
            avto2.appendChild(stamp2);

            Element model2 = car.createElement("Model");
            model2.appendChild(car.createTextNode("Astra J"));
            avto2.appendChild(model2);

            Element year2 = car.createElement("Year");
            year2.appendChild(car.createTextNode("2013"));
            avto2.appendChild(year2);

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

            System.out.println("XML-файл создан");
            Scanner in = new Scanner(System.in);
            while (true)
            {
                System.out.println("___________________________________\n");
                System.out.println("Выберите действие: ");
                System.out.println("1 - Добавить марку автомобиля");
                System.out.println("2 - Удалить марку автомобиля");
                System.out.println("3 - Поиск по марке автомобиля");
                System.out.println("4 - Вывести список автомобилей");;
                System.out.println("0 - Выход");
                System.out.println("___________________________________\n");
                System.out.print("Действие?: ");
                int s1 = in.nextInt();
                in.nextLine();
                switch (s1) {
                    case 1: AddCar.add();
                        break;
                    case 2: Delete.deletecar();
                        break;
                    case 3:  Search.searchcar();
                        break;
                    case 4: ReadXML.raead();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Не правильно выбран вариант");
                }
            }

        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }

}


