package lr10.Example6;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {
    public static void readcar() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser
                    .parse(new FileReader("src/lr10/Example6/Example-JSON,json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("avto");

            for (Object o: jsonArray)
            {
                JSONObject avto1 = (JSONObject) o;
                System.out.println("Марка автомобиля: "+avto1.get("Stamp"));
                System.out.println("Модель автомобиля: "+avto1.get("Model"));
                System.out.println("Год производства: "+avto1.get("Year"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
